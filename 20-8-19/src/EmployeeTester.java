
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import comm.example.model.Employee;
import comm.example.service.EmployeeService;
import comm.example.service.EmployeeServiceImpl;

public class EmployeeTester {
private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) throws SQLException {
		EmployeeService service=new EmployeeServiceImpl();
		service.getConnectionInfo();
		int choice=0;
		do {
			System.out.println("1.create employee.");
			System.out.println("2.display all employee");
			System.out.println("3.remove an employee");
			System.out.println("4.update an employee details");
			System.out.println("0:exit");
			System.out.print("Your Choice: ");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("EMployee ID: ");
				int id = scanner.nextInt();
				System.out.print("Employee First Name: ");
				String firstName = scanner.next();
				System.out.print("Employee Last Name: ");
				String lastName = scanner.next();
				System.out.print("Employee Email: ");
				String email = scanner.next();
				service.createEmployee(new Employee(id, firstName, lastName, email));
				break;
			case 2:
				List<Employee> list=service.getAllEmployees();
				for(Employee e:list)
				{
					System.out.printf("\n%d\t%s\t%s\t%s",e.getId(),e.getFirstName(),e.getLastName()
							,e.getEmail());
				}
				break;
			case 3:
				System.out.println("Enter the employee id to be removed");
				int empId = scanner.nextInt();
				service.removeEmployee(empId);
				break;
			case 4:
				System.out.println("Enter the employee id needed to be modified");
				int empIdModify = scanner.nextInt();
				System.out.println("Which field to be changed???");
				System.out.println("1.FirstName");
				System.out.println("2.LastName");
				System.out.println("3.Email");
				int field = scanner.nextInt();
				switch(field) {
				case 1:
					System.out.print("Employee First Name: ");
					String firstNameModify = scanner.next();
					service.modifyEmployeeFName(empIdModify, firstNameModify);
					main(null);
					break;
				case 2:
					System.out.print("Employee Last Name: ");
					String lastNameModify = scanner.next();
					service.modifyEmployeeLName(empIdModify, lastNameModify);
					main(null);
					break;
				case 3:
					System.out.print("Employee Email: ");
					String emailModify = scanner.next();
					service.modifyEmployeeEmail(empIdModify, emailModify);
					main(null);
					break;
				default:
					System.out.println("Exit...");
				}
			case 0:
				System.out.println("Bye!");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice.");
				break;
			}
			
		} while (choice!=0);
		
		

	}

}