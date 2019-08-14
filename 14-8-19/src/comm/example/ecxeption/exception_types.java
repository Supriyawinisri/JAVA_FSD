package comm.example.ecxeption;

public class exception_types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(String a : args) {
			try {
				System.out.println(args[10]);
				sum += Integer.parseInt(a);
			}
			catch(NumberFormatException ne) {
				System.err.println("Number Format Error...");
				System.err.println(ne.getMessage());
				ne.printStackTrace();
				System.err.println(ne.getCause().toString());
				System.exit(0);
			}
			catch(ArrayIndexOutOfBoundsException ae) {
				System.err.println("Array Index Error...");
			}
			//Exception class must be called only at last catch
			catch(Exception e) {
				System.err.println("Exception occured...");
			}
		}
		System.out.println("Sum: "+sum);
	}

}
