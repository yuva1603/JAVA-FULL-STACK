package classjava8ThreadSych;
public class SleepExample {

	public static void main(String[] args) {
		// example for perfect Synchronized class
		
		// thread initiation
		Thread t=new Thread(new Runnable() {
			public void run()
			{
				// thread started
				System.out.println("Thread Starting ");
				
				try {
					Thread.sleep(3000); //Sleep for 3sec
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				System.out.println("Thread resumed after sleep");
			}
		});
		t.start();
	}

}
	