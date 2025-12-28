package classjava4;

public class NestedTryExceptionDay18 {

	public static void main(String[] args) {
		try
		{
			String s=null;
			try
			{
				System.out.println(s.length());
			}
			catch(NullPointerException e) {
				System.out.println("Inner Catch : String is null");
			}
		}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Outer Catch : INvalid array Index");
			}
		finally {
			System.out.println("This Will Always Execute");
			}
		}
	}
