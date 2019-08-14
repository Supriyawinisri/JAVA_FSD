package comm.example.account;

public class TesterAccount {
	
	public static void main(String args[]) {
		
		Account acc = new Account(20,"Priya");
		Account acc1 = new Account(25,"Priya");
		System.out.println(acc.equals(acc1));
		System.out.println(new Account());
	}
}
