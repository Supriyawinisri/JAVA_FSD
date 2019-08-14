package comm.example.inherit;

public class PermanentEmployee extends Employee {
	
	private int salary;

	public PermanentEmployee() {
		
	}
	
	public PermanentEmployee(int salary) {
		super(1,"ABC","DEF","FSD");
		this.salary = salary;
	}
	
	@Override
	protected String getDetails() {
		return super.getDetails() + " Salary: "+salary;
	}
}
