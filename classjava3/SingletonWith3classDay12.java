package classjava3;
class Single{
	private static Single obj =new Single();
	private Single() {}
	public static Single getInstance() {
		
		return obj;
	}
	public void message(String from) {
		System.out.println("Called From "+" "+from);
	}
}
class ClassA{
	void useSingleton() {
		Single s= Single.getInstance();
		s.message("Class A");
	}
}

class ClassB{
	void useSingleton() {
		Single s= Single.getInstance();
		s.message("Class B");
	}
}

class ClassC{
	void useSingleton() {
		Single s= Single.getInstance();
		s.message("Class A");
	}
}

public class SingletonWith3classDay12 {

	public static void main(String[] args) {
		ClassA a = new ClassA();
		ClassB b = new ClassB();
		ClassC c = new ClassC();
		a.useSingleton();
		b.useSingleton();
		c.useSingleton();
	}

}
