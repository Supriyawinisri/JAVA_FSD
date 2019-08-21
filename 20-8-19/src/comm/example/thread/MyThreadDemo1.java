package comm.example.thread;

public class MyThreadDemo1 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThreadDemo myThread = new MyThreadDemo();
		MyThreadDemo1 myThread1 = new MyThreadDemo1();
		MyThreadDemo2 myThread2 = new MyThreadDemo2();
		Thread t1 = new Thread(myThread);
		Thread t2 = new Thread(myThread1);
		Thread t3 = new Thread(myThread2);		
		t1.start();
		System.out.println(t1.isAlive());
		t2.start();
		t3.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int j = 0; j < 20; j++) {
				System.out.println("j==>"+j);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
