package comm.example.product;

public class Book extends Product {
	
	private String auth_name;
	
	public Book(String auth_name, int curr_name) {
		super(curr_name);
		this.auth_name = auth_name;
		System.out.println("Auther Name: "+auth_name);
	}

}
