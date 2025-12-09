package day12;
class Count{
	static int counter=0;
	Count(){
		counter++;
	}
}
public class CountObjects {

	public static void main(String[] args) {
		new Count();
		new Count();
		new Count();
		System.out.println("The Count of Objects is :" +Count.counter);
		
	}

}
