package comm.example.singleton;

public class Messaging {

	public String name;
	//object for class
	public static Messaging messaging;

	private Messaging() {
		super();
	}

	private Messaging(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Messaging [messaging=" + name + "]";
	}
	
	//singleton
	public static Messaging createMessage() {
		if(messaging == null) {
			messaging = new Messaging();
		}
		return messaging;
	}
	
	public static Messaging createMessage(String name1) {
		if(messaging == null) {
			messaging = new Messaging(name1);
		}
		return messaging;
	}
}
