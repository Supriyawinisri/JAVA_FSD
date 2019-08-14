package comm.example.account;

public class Account {
	
	private int amt;
	private String name;
	
	public Account() {
		
	}
	
	public Account(int amt, String name) {
		this.amt = amt;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		Account a =(Account)obj;
		if(a.amt == this.amt) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Amount: "+amt+" Name: "+name;
	}

	
}
