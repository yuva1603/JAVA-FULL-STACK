package classjava2;

class Animals{
			void eat() {
				System.out.println("This animal eats food");	}
		}
		class Mammal extends Animal{
			void walk() {
				System.out.println("Mammal Can Walk");
			}
		}
		class Dog1 extends Mammal{
			void bark() {
				System.out.println("Dog Barks .");
			}
		}
		public class MultilevelInheritanceDay10 {

			public static void main(String[] args) {
				Dog1 myDog = new Dog1();
				myDog.eat(); // Inherited from animal
				myDog.walk(); // Inherited from mammal
				myDog.bark(); //Own method

			}

		}

	

