package comm.example.array;

public class ArrayDemo {

	private char arr[];
	
	public char[] getArray(int length) {
		arr = new char[length];
		for (int i=0;i<length;i++) {
			arr[i] = (char)('A'+i);
		}
		return arr;
	}
}