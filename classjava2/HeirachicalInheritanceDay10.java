package classjava2;
 
class Animal3{
	void eat() {
		System.out.println("The Animal Eats food");
	}
}

class Dog3 extends Animal3{
	void bark() {
		System.out.println("Dog Barks");
	}
}

class Cat3 extends Animal3{
	void meow() {
		System.out.println("Cat meows");	
	}
}

public class HeirachicalInheritanceDay10 {

	public static void main(String[] args) {
		
		Dog3 obj=new Dog3();
		obj.eat();
		obj.bark();
		
		Cat3 cat=new Cat3();
		cat.eat();
		cat.meow();

	}

}
