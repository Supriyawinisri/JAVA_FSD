package comm.example.constructor;

public class JavaConstructor {
	private int x ,y ,z ;
	
	public JavaConstructor() {
		this(10);
	}
	
	public JavaConstructor(int x) {
		this(x, 12);
	}
	
	public JavaConstructor(int x , int y) {
		this(x ,y, 1997);
	}
	
	public JavaConstructor(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void getDetails() {
		System.out.println("X "+x+" Y "+y+" Z "+z);
	}
}
