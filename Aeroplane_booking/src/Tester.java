import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import comm.example.model.Aeroplane;
import comm.example.service.AeroplaneService;
import comm.example.service.AeroplaneServiceImpl;

public class Tester {
	
	private static int id;
	private static String name;
	private static int seat;
	private static Scanner scanner;

	public static void main(String[] args) throws SQLException {
		scanner = new Scanner(System.in);
		AeroplaneService service = new AeroplaneServiceImpl();
		System.out.println("Enter flight number:");
		id = scanner.nextInt();
		System.out.println("Enter flight name:");
		name = scanner.next();
		System.out.println("Enter the number of seats:");
		seat = scanner.nextInt();
		service.createAeroplane(new Aeroplane(id, name, seat));
		List<Aeroplane> list=service.getAllAeroplane();
		for(Aeroplane a:list)
		{
			System.out.printf("\n%d\t%s\t%s",a.getPlane_id(),a.getPlane_name(),a.getSeat_no());
		}
	}

}
