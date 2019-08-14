package comm.example.ecxeption;

import java.util.Scanner;

public class TesterPerson {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fName = null;
		String lName = null;
		Person p[] = new Person[3];
		int i = 0;			
		try {
			do {
				System.out.println(i);
				System.out.println("First Name: ");
				fName = scanner.next();
				System.out.println("Last Name: ");
				lName = scanner.next();
				p[i] = new Person(fName,lName).checkCase(fName,lName);
				i++;
			}
			while(i<2);				
		} catch(AccountNotValidException e) {
			System.err.println(e.getMsg());
		}
		System.out.println(p[i-2].equals(p[i-1]));
	}

}