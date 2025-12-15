package classjava3;


class SimpleImplementation
{
	private SimpleImplementation() {
	}
	private static SimpleImplementation obj=new SimpleImplementation();
	public static SimpleImplementation getInstance()
								//SingleTon design static
	{
		return obj;
	}
	public void showMessage() 
	{
		System.out.println("SingleTon Class Is Working ");
	}
	
}
class TestClass{
	public void showMessage2() {
		SimpleImplementation obj=SimpleImplementation.getInstance();
		obj.showMessage();
	}
}
public class SinglePatternDay12 {

	public static void main(String[] args) {
		SimpleImplementation obj=SimpleImplementation.getInstance();
		obj.showMessage();

	}

}
