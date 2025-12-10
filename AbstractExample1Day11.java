package classjava2;

abstract class AnimalAbs{
	
	abstract void sound(); //abstract method
	void sleep()  //Non Abstract method
	{
		System.out.println("Sleep");
	}
}
public class AbstractExample1Day11 extends AnimalAbs{

	void sound() {
		System.out.println("Dog Barks");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractExample1Day11 obj = new AbstractExample1Day11();
		obj.sleep();
		obj.sound();
	}

}
