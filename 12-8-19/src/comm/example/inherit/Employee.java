package comm.example.inherit;

public class Employee {

	private int id;
	private String fName, lName, dept;

	public Employee() {
		
	}
	
	public Employee(int id, String fName, String lName, String dept) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.dept = dept;
	}
	
	protected String getDetails() {
		return "Employee Id: "+id+" Name: "+fName+" "+lName+" Department: "+dept;
	}
	
}
