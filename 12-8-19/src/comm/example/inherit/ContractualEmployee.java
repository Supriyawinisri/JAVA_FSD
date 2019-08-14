package comm.example.inherit;

public class ContractualEmployee extends Employee {
	
	private int rent_hr;

	public ContractualEmployee() {
		
	}
	
	public ContractualEmployee(int rent_hr) {
		super(2,"RSP","XYZ","JAVA");
		this.rent_hr = rent_hr;
	}
	
	@Override
	protected String getDetails() {
		return super.getDetails() + " Rent: "+rent_hr;
	}

}
