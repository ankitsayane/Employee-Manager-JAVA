package tester;
import static utils.populateData.populateEmp;
import static validation.validation.aadharDup;
import static validation.validation.aadharValidation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.core.Employee;
import com.core.FTEmployee;
import com.core.PTEmployee;

import customexceptions.AadharAuthenticationException;
import customexceptions.EmployeeException;

public class EmployeeMain {

	public static void main(String[] args) throws EmployeeException, AadharAuthenticationException {
		try(Scanner sc = new Scanner(System.in)){
			ArrayList<Employee> empList = populateEmp();
			int choice;
			do {
				System.out.println("1. Add FullTime Employee\n"
						+ "2. Add PartTime Employee\n"
						+ "3. Delete Employee by Id\n"
						+ "4. Search Employee by Aadhar\n"
						+ "5. Display All Employee Details\n"
						+ "6. Sort Employee by Joining Date\n"
						+ "7. Exit");
				System.out.print("Enter your Choice : ");
				choice = sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Enter Name, Date, Phone, Aadhar, Salary");
					FTEmployee ft = new FTEmployee(sc.next(), LocalDate.parse(sc.next()), sc.nextLong(), aadharDup(sc.next(), empList), sc.nextDouble());
					empList.add(ft);
					System.out.println("Full Time Employee Added Successfully..");
					break;
					
				case 2: 
					System.out.println("Enter Name, Date, Phone, Aadhar, Pay Per Hour");
					PTEmployee pt = new PTEmployee(sc.next(), LocalDate.parse(sc.next()), sc.nextLong(), aadharDup(sc.next(), empList), sc.nextDouble());
					empList.add(pt);
					System.out.println("Part Time Employee Added Successfully..");
					break;
					
				case 3:
					System.out.print("Enter Employee Id : ");
					int id = sc.nextInt();
					for(Employee a : empList) {
						if(a.getEmpId() == id) {
							empList.remove(a);
							System.out.println("Employee ID: "+a.getEmpId() + " Removed");
						}
					}
					break;
					
				case 4: 
					System.out.print("Enter Aadhar : ");
					String ad = aadharValidation(sc.next(), empList);
					for(Employee a : empList) {
						if(a.getEmpAadhar().equals(ad)) {
							System.out.println(a);
						}
					}
					break;
					
				case 5:
					for(Employee a : empList) {
						System.out.println(a);
					}
					break;
					
				case 6:
					Collections.sort(empList, new Comparator<Employee>() {
						@Override
						public int compare(Employee o1, Employee o2) {
							return o2.getJoinDate().compareTo(o1.getJoinDate());
						}
					});
					for(Employee a : empList) {
						System.out.println(a);
					}
					break;
					
				case 7:
					choice = 7;
					break;
				}
				
			}while(choice != 7);
		}

	}

}
