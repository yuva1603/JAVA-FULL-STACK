package day12;
class Singleton{
	private static Singleton obj=new Singleton();
	private Singleton() {
}
	public static Singleton getInstance() {
		return obj;
	} 
	public void message(String msg) {
		System.out.println("There is a Printer Manager in Your Area"+" "+msg);
	}
}
	class Emp
	{
		void useSingleton() {
		Singleton s=Singleton.getInstance();
		s.message("Keep Rocking");
	  }
	}
	class Emp2{
		void useSingleton() {
			Singleton s=Singleton.getInstance();
			s.message("Not Quite impressive");
		}
	}
	
public class SingleTonBuild {

	public static void main(String[] args) {
		Emp e=new Emp();	
		Emp2 e1 = new Emp2();
		e.useSingleton();
		e1.useSingleton();
	}
}

