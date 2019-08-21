package comm.example.employeelist;

public class EmployeeBO {
	
	public void printEmployee(Employee e){
		System.out.printf("%5d %-15s %-30s %-30s %-10s %-10s\n",e.getId(),e.getName(),e.getDepartment(),e.getDateOfJoining(),e.getAge(),e.getSalary());
	}
}
