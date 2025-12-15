package classjava3;
class StaticExample {
	static int counter=0;
	StaticExample()
	{
		counter++;
	}
}
public class StaticSampleDay12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StaticExample();
		new StaticExample();
		new StaticExample();
		System.out.println(StaticExample.counter);
	}
	
}
