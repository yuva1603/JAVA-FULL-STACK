package classjava2;

class DefaultConstruct {
	String name;
	
	//Default Constructor 
	DefaultConstruct() //same name as class name
	{
		name="ram"; //Directly Passing the value
	}
	
	void display() {
		System.out.println("Name "+name);
	}
}
	//constructor = constructing the objects
	public class ConstructorFirstDay9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstruct obj=new DefaultConstruct();
		obj.display();
	}

}
