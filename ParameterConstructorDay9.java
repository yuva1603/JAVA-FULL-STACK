package classjava2;

class Student{
	String name;
	int age;
	
	//parameterized constructor
	Student(String n,int a){
		name=n;
		age=a;
		
	}
}

public class ParameterConstructorDay9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Suriya",25);
		Student s2=new Student("Kiss",27);
		
		System.out.println(s1.name+" "+s1.age+" ");
		System.out.println(s2.name+" "+s2.age+" ");
		
	}

}
