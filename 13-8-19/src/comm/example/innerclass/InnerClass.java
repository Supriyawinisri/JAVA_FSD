package comm.example.innerclass;

public class InnerClass {
	
	public int x, y;
	
	public InnerClass() {
		super();
	}

	public InnerClass(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void display() {
		System.out.println("Displaying from Outer class...");
		System.out.println("X.."+x+" Y.."+y);
	}
	
	public class OuterClass{
		
		public void display1() {
			x=10;
			y=20;
			display();
			System.out.println("Displaying from Inner class...");
			System.out.println("X.."+x+" Y.."+y);
		}
	}

}
