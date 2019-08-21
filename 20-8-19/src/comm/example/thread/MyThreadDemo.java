package comm.example.thread;

public class MyThreadDemo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i = 0; i < 20; i++) {
				if(i==10) {
					//i want to sleep
					Thread.sleep(5000);
					//i'm ready for sleep if you need i can go to sleep
					//Thread.yield();
					
				}
				System.out.println("i==>"+i);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
