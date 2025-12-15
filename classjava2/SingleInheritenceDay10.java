package classjava2;

class Animal{
	void eat() {
		System.out.println("This animal eats food");	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog Barks");
	}
}
class Cat extends Dog{
	void meow() {
		System.out.println("Cat Meows .");
	}
}
public class SingleInheritenceDay10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog();
		myDog.eat(); // Inherited method
		myDog.bark(); // Child class method

	}

}
