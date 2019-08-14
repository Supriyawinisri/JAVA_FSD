package comm.example.enum1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
		try {
			System.out.println("Coach name: ");
			name = sc.next();
			TennisCoach myCoach = new TennisCoach();
			myCoach.createCoach(name, Level.LOW);
			System.out.println(myCoach.getCoachDetails().toString());
		}
		catch (InputMismatchException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.err.println(e.toString());
		}
	}

}
