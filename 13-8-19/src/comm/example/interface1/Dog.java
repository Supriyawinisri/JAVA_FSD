package comm.example.interface1;

public class Dog {

	public String name, breed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Dog() {
		super();
	}

	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}
	
	public void createDogclass() {
		RlnInterface rln = new RlnInterface() {

			@Override
			public void getName1() {
				// TODO Auto-generated method stub
				System.out.println("Dog name: "+ getName() +" Dog breed: "+ getBreed());
			}
		};
		rln.getName1();
	}
}
