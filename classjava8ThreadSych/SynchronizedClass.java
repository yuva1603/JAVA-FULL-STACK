package classjava8ThreadSych;

class Test{
	
	synchronized void test_fun(int n)
	{
		
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(n+i);
			try {
				Thread.sleep(4000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
public class SynchronizedClass {

	public static void main(String[] args) {
		final Test obj=new Test(); // Class Object 
		
		//thread Obj
		Thread a=new Thread()
				{
			public void run()
			{
				obj.test_fun(15);
			}
		};
		
		Thread b=new Thread()
				{
			public void run()
			{
				obj.test_fun(30);
			}
		};
		a.start();
		b.start();

	}

}
