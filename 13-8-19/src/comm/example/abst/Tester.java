package comm.example.abst;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyer flyer = new Bird();
		flyer.takeoff();
		flyer = new Superman();
		flyer.takeoff();
	}
}