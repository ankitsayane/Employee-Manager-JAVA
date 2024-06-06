package utils;

import java.time.LocalDate;
import java.util.ArrayList;

import com.core.Employee;
import com.core.FTEmployee;
import com.core.PTEmployee;

public class populateData {
	public static ArrayList<Employee> populateEmp(){
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new FTEmployee("John Smith", LocalDate.parse("2023-01-02"), 947654321, "240456789112", 22300));
		empList.add(new PTEmployee("Mathew Snow", LocalDate.parse("2024-01-01"), 957654321, "203456789112", 1300));
		empList.add(new PTEmployee("James Andrew", LocalDate.parse("2024-01-01"), 687654321, "303456789112", 2000));
		empList.add(new FTEmployee("Virat Kohli", LocalDate.parse("2022-03-25"), 787654321, "903456789112", 125000));
		empList.add(new FTEmployee("Rohit Sharma", LocalDate.parse("2022-10-10"), 887654321, "503456789112", 102300));
		return empList;
	}
}
