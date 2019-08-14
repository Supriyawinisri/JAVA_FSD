package comm.example.inherit;

public class TestInherit {
	
	public static void main(String args[]) {
		ContractualEmployee c = new ContractualEmployee(50000);
		PermanentEmployee e = new PermanentEmployee(100000);
		System.out.println(c.getDetails());
		System.out.println(e.getDetails());
	}

}
