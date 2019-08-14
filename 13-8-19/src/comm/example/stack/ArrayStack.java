package comm.example.stack;

public class ArrayStack {

	int arr[]= {};
	int size;
	public int getSize(int size) {
		return size;
	}
	
	public int[] push(int value) {
		for(int i=0;i<size;i++) {
			if(arr[i]=='\0') {
				arr[i] = value;
				System.out.println(arr);
			}
			else {
				System.out.println("else ");
			}
		}
		return arr;
	}
}
