package comm.example.ecxeption;

import java.io.Serializable;

public class Account implements Serializable {
	private int accountNumber;
	private double amount;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Account() {
		super();
	}
	public Account(int accountNumber, double amount) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", amount=" + amount + "]";
	}
	public Account createnewAccount(int accno, double amt) throws AccountNotValidException{
		this.accountNumber = accno;
		this.amount = amt;
		if(amt<10000) {
			throw new AccountNotValidException("Not a valid amount...");
		}
		return new Account(accountNumber, amount);
	}
}