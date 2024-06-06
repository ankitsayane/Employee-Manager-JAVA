package validation;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.core.Employee;
import customexceptions.AadharAuthenticationException;
import customexceptions.EmployeeException;

public class validation {
	public static String aadharValidation(String aadhar, ArrayList<Employee> empList) throws AadharAuthenticationException, EmployeeException {
		String aadharRegex = "^\\d{12}$";
		Pattern p = Pattern.compile(aadharRegex);
		Matcher m = p.matcher(aadhar);
		boolean b = m.matches();
		if(b)
			return aadhar;
		throw new AadharAuthenticationException("Invalid Aadhar Number..");
	}
	
	public static String aadharDup(String aadhar, ArrayList<Employee> empList) throws EmployeeException, AadharAuthenticationException {
		String a = aadharValidation(aadhar, empList);
		for(Employee e : empList) {
			if(e.getEmpAadhar().equals(a)) {
				throw new EmployeeException("Aadhar is Already Present");
			}
		}
		return a;
	}
}
