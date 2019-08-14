package comm.example.ecxeption;

public class TesterAccount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		try {
			a.createnewAccount(123, 1234);
		} catch(AccountNotValidException e) {
			System.err.println(e.getMsg());
		}
	}
}
