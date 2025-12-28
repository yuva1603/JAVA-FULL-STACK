package classjava5;

public class WrapperClassesDay23 {

	public static void main(String[] args) {
		int x=25;
		Integer y= Integer.valueOf(x);
		
		System.out.println(y);
	
	
		char a='b';
		Character c=new Character(a);
		System.out.println(c);
		
		double db=25.23;
		Double dbc=new Double(db);
		System.out.println(dbc);
		
		int a1=20;
		Integer obj=a1;
		
		System.out.println("Auto Boxing "+obj);
		
	}
}
