package classjava4;

public class ExceptionHandlingExampleDay17 {

	public static void main(String[] args) {
		int n=10;
		int m=0;
		try
		{
			int ans=n/m;
			System.out.println("The Answer is "+ans);
		}
		catch(Exception e)
		{
			System.err.println("Error Divide by 0 "+e);
		}
	}
}
