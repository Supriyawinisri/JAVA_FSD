package comm.example.employeelist;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TesterEmployee {
	
	private static String name;
	private static String department;
	private static String dateOfJoining;
	private static Integer age;
	private static Integer salary;
	private static Scanner scanner;
	private static EmployeeBO empBO;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> emp = new TreeSet<Employee>();
		Set<AgeComparator> ageCom = new TreeSet<AgeComparator>();
		scanner = new Scanner(System.in);
		System.out.println("Input the number of employees :");
		int count = scanner.nextInt();
		for(int i=1; i<=count; i++) {
			System.out.println("Enter the details for employee "+i);
			name = scanner.next();
			department = scanner.next();
			dateOfJoining = scanner.next();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
			Date date=null;
			try {
			    //Parsing the String
			    date = dateFormat.parse(dateOfJoining);
			} catch (ParseException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			}
			age = scanner.nextInt();
			salary = scanner.nextInt();
			emp.add(new Employee(i, name, department, date, age, salary));
			ageCom.add(new AgeComparator(i, name, department, date, age, salary));
		}
		System.out.println("1.Sort employees by salary\r\n" + 
				"2.Sort employees by age and by date of joining\r\n" + 
				"Enter your choice\r\n");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Name                           Department");
			System.out.println("Date Of Joining      Age        Salary");
			for(Employee e : emp) {
				System.out.println(e);
			}
			break;
		case 2:
			System.out.println("Name                           Department");
			System.out.println("Date Of Joining      Age        Salary");
			for(AgeComparator a : ageCom) {
				System.out.println(a);
			}
			break;
		default:
			break;
		}
	}
}
