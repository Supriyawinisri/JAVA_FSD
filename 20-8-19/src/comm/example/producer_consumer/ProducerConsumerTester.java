package comm.example.producer_consumer;

public class ProducerConsumerTester {
	

	private final static MyStack myStack=new MyStack();
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		StackProducer sProducer = new StackProducer(myStack);
		StackConsumer sConsumer = new StackConsumer(myStack);
		Thread t1 = new Thread(sProducer,"Producer");
		Thread t2 = new Thread(sConsumer,"Consumer");
		t1.start();
		t2.start();
	}

}
