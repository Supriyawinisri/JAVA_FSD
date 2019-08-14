package comm.example.ecxeption;

public class number_format_exception {

	public static void main(String args[]) {
		
		int sum = 0;
		for(String a : args) {
			try {
				sum += Integer.parseInt(a);
			}
			catch(NumberFormatException e) {
				System.err.println("Number Format Error...");
				System.err.println(e.getMessage());
				e.printStackTrace();
				System.err.println(e.getCause().toString());
				System.exit(0);
			}
		}
		System.out.println("Sum: "+sum);
	}
}
