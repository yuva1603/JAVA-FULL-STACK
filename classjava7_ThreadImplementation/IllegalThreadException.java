package classjava7_ThreadImplementation;

public class IllegalThreadException {

	public static void main(String[] args) {
		Thread thread=new Thread(()->{
			System.out.println("Thread Running");
		});
		thread.start(); //First Start
		try {
			thread.start(); //Illegal Start
			System.out.println("Hai");
		}
		catch(IllegalThreadStateException e)
		{
			System.out.println("Exception Caught "+e.getMessage());
		}

	}

}
