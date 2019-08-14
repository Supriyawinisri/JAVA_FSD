package comm.example.product;

public class Electronics extends Product {
	
	private int man_yr, rate;
	
	public Electronics(int man_yr, int curr_rate) {
		super(curr_rate);
		this.man_yr = man_yr;
		System.out.println("Manufacturing Year: "+man_yr);
	}
}
