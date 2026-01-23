package classjava8ThreadSych;


class Demo
{
	synchronized void waitmethod()
	{
		try
		{
			System.out.println(Thread.currentThread().getName() + " waiting");
			wait();
			System.out.println(Thread.currentThread().getName() + " resumed");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class Threads_notifyAll {

	public static void main(String[] args) {
		Demo obj=new Demo();
		Thread t1 = new Thread(()->obj.waitmethod(),"Thread-1");
		Thread t2 = new Thread(()->obj.waitmethod(),"Thread-2");
		
		t1.start();
		t2.start();
		try {
		Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		synchronized(obj)
		{
			System.out.println("Main Thread Calling notifyAll()");
			obj.notify(); // Notify only one thread
			obj.notifyAll(); // Notify all thread
		}

	}

}
