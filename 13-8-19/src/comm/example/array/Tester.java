package comm.example.array;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemo arraydemo = new ArrayDemo();
		char arr[] = arraydemo.getArray(26);
		for (char c : arr) {
			System.out.print(c+" ");
		}
	}
}