package classjava3;
class Sampling
{
	final int a=100;
	void show() {
		System.out.println("Max"+" "+a);
		//a=102 not possible due to final a=102
	}
}
class Sampling2{
	final int b;
	Sampling2(int value){
		b=value;
	}
	void showB() {
		System.out.println("Max"+" "+b);
	}
}
public class FinalSampleDay12 {

	public static void main(String[] args) {
		Sampling s=new Sampling();
		s.show();
		Sampling2 s1=new Sampling2(500);
		s1.showB();
	}

}
