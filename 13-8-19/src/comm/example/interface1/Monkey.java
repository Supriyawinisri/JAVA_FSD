package comm.example.interface1;

public class Monkey implements RlnInterface {

	private String name;
	
	
	public Monkey() {
		super();
	}


	public Monkey(String name) {
		super();
		this.name = name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void getName1() {
		// TODO Auto-generated method stub
		System.out.println("Monkey: "+name+" can also walk");
	}

}
