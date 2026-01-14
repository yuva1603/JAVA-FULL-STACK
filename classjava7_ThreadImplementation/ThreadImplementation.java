package classjava7_ThreadImplementation;

public class ThreadImplementation {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			final int threadNumber = i;
			 // thread created
			Thread t=new Thread(()->{
				
				System.out.println("Thread is running "+threadNumber+" is running");
			});
			
			t.start(); //thread started
			try {
				t.join(); //thread Started
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
