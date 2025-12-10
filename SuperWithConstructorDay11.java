package classjava2;
class Animal6{
	Animal6() 
	{
		System.out.println("Animal Sounds Well");
	}
}
class Dog6 extends Animal6
{
	Dog6()
	{
		super();//Overridden method
		System.out.println("Dog Barks");
	}
}
public class SuperWithConstructorDay11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog6 obj=new Dog6();
	}

}
