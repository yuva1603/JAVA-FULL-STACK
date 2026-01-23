package classjava8ThreadSych;

public class DeadLockDemo {
	static Object lock1 = new Object();
	static Object lock2 = new Object();

	public static void main(String[] args) {
		
		Thread t1 = new Thread(()->{
		
				synchronized(lock1)
				{
					System.out.println("Thread 1:Holding lock1 .. . . . ");
					try
					{
						Thread.sleep(1000);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					synchronized(lock2)
					{
						System.out.println("Thread 1:Holding lock1 & lock2 . . .. . . ");
					}
					
				}
		});
		
		Thread t2=new Thread(()->{
				
				synchronized(lock2)
				{
					System.out.println("Thread 2:Holding lock2 .. . . . ");
					try
					{
						Thread.sleep(1000);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					synchronized(lock2)
					{
						System.out.println("Thread 2:Holding lock2 & lock1 . . .. . . ");
					}
					
				}
				});
		t1.start();
		t2.start();

	}

}
