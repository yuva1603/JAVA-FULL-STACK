package classjava2;
interface ani{
	void sound();
	void sleep();
}
class Inter implements ani{
	public void sound() {
		System.out.println("It will make Sleep");
	}
	public void sleep() {
		System.out.println("It woll Make Sound");
	}
}
public class AbstractUsingInterfaceDay11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter call=new Inter();
		call.sound();
		call.sleep();
	}

}
