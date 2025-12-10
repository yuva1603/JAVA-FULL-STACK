package classjava2;

interface Animal2{
	void eat();
}

interface Mammal2{
	void walk();
}

class Dog2 implements Animal2,Mammal2 {
	public void eat() {
		System.out.println("Dog eats food");
	}
	public void walk() {
		System.out.println("Dog walks on four legs");
	}
}

 
public class MultipleInheritancesDay10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 mydog = new Dog2();
		mydog.eat();
		mydog.walk();
	}

}
