package comm.example.product;

public class Product {
	
	public static int count;
	public int curr_rate;
	
	public int getCurr_rate() {
		return curr_rate;
	}

	public void setCurr_rate(int curr_rate) {
		this.curr_rate = curr_rate;
	}
	
	static {
		count=0;
	}

	public Product(int curr_rate) {
		this.curr_rate = curr_rate;
		count++;
		System.out.println("Current Rate: "+curr_rate+" Count: "+count);
	}

}
