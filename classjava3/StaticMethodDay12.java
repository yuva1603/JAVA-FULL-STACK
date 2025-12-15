package classjava3;

//Static variable and static method

class StaticExample1{
	static int counter =0;
	static void displaycount()
	{
		System.out.println("The value is "+" "+counter);
	}
}

public class StaticMethodDay12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample1.counter=9;
		
		StaticExample1.displaycount();
	}

}
