package classjava2;

abstract class AnimalSba{
	AnimalSba(){
		System.out.println("Just a Constructor in animal Class");
	}
	abstract void sound(); //abstract method
	void sleep()  //Non Abstract method
	{
		System.out.println("Sleep");
	}
}
public class AbstractExample2Day11 extends AnimalSba {
	AbstractExample2Day11(){
		System.out.println("Just a constructor in Abstract Example Class");
	}
	void sound() {
		System.out.println("Dog Barks");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalSba obj = new AbstractExample2Day11(); //using constructor 
		obj.sleep();
		obj.sound();
	}

}
