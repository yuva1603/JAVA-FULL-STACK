package classjava2;
//parent interface 1
interface Animales {
	void eat();
}
//Parent Interface 2
interface Mammales{
	void walk();
}
//Child Class (Implementing Multiple Interfaces)
class Doges implements Animales,Mammales{
	public void eat() {
		System.out.println("Dog eats Food");
	}
	public void walk() {
		System.out.println("Dog Walks on four legs");
	}
}
//Another Class Inheriting from Dog
class Puppy extends Doges{
	void weep() {
		System.out.println("Puppy weeps");
	}
}
public class HybridInheritanceDay11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy myPuppy = new Puppy();
		myPuppy.eat();
		myPuppy.walk();
		myPuppy.weep();
	}
}
