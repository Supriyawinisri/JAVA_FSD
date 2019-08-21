package comm.example.producer_consumer;

public class MyStack {
	
	private int index=-1;
	private static final int MAX=26;
	private char[] info=new char[MAX];
	
	public synchronized void push(char item) throws InterruptedException
	{
		if(index==MAX)
		{
			System.out.println("stack ovrerflow");
			System.out.println("producer waiting");
			wait();
			
		}
		info[++index]=item;
		System.out.println("consumer notified");
		notify();
	}
	
	public synchronized char pop() throws InterruptedException
	{
		if(index==-1)
		{
			System.out.println("stack underflow.");
			System.out.println("consumer waiting");
			wait();
		}
		System.out.println("producer notified");
		notifyAll();
		return info[index--];
		
	}

}
