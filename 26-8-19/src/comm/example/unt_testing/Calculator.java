package comm.example.unt_testing;

public class Calculator {
	
	int x, y, result;

	public Calculator() {
		super();
	}

	public Calculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int addMethod() {
		result= x+y;
		return result;
	}
	
	public int subMethod() {
		result= x-y;
		return result;
	}
	
	public int compareMethod() {
		if(x>y) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
