package comm.example.ecxeption;

import java.io.Serializable;

public class Person implements Serializable {

	private String fname, lName;

	public Person() {
		super();
	}

	public Person(String fname, String lName) {
		super();
		this.fname = fname;
		this.lName = lName;
		
	}
	
	public Person checkCase(String fName, String lName) throws AccountNotValidException{
		this.fname = fName;
		this.lName = lName;
		if(Character.isUpperCase(fname.charAt(0))!=true || Character.isUpperCase(lName.charAt(0))!=true) {
			throw new AccountNotValidException("Not a valid Character...");
		}
		return new Person(fname,lName);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Person p =(Person)obj;
		if(p.fname.contentEquals(this.fname) && p.lName.contentEquals(this.lName)) {
			return true;
		}
		else {
			return false;
		}
	}
}
