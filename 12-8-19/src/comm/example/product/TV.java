package comm.example.product;

public class TV extends Electronics {
	
	private String name;
	
	public TV(String name, int curr_rate) {
		super(1997, curr_rate);
		this.name = name;
		System.out.println("Name of the TV: "+name);
	}

}
