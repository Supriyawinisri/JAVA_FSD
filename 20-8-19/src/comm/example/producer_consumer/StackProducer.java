package comm.example.producer_consumer;

public class StackProducer implements Runnable {

	private MyStack myStack;

	public StackProducer(MyStack myStack) {
		super();
		this.myStack = myStack;
	}

	@Override
	public void run() {
		for(int i=0;i<26;i++)
		{
			try {
				myStack.push((char)((char)i+97));
				System.out.println("Produced==>"+((char)((char)i+97)));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}