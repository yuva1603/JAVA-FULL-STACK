package classjava2;

class Animal5
{
	void sound()
	{
		System.out.println("Animal Sounds well");
	}
}
class Dog5 extends Animal5
{
	@Override
	void sound() // Overridden Method
	{
		super.sound();
		System.out.println("Dog Barks");
	}
}
public class MethodOverRidingDay11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal5 obj=new Animal5();
		obj.sound();
	}

}
