package classjava4;
class InvalidMarksException extends Exception
{
	InvalidMarksException(String msg)
	{
		super(msg);
	}
}
public class MarksCheckExceptionDay18 {

	public static void main(String[] args) {
		int marks=120;
		
		try 
		{
			if(marks>0||marks>100)
				{
				throw new InvalidMarksException("Marks between 0 to 100");
				}
			else 
			{
				System.out.println("Valid Marks "+marks);
			}
		}
		catch(InvalidMarksException e)
		{
			System.out.println(e.getMessage());
			
		}

	}

}
