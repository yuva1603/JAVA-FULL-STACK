package classjava2;

class Student1{
	String name;
	int age;
	//default constructor
	Student1(){
		name="No Student";
	}
	//parameterized constructor
	Student1(String n){
		name=n;
		age=0;
		}
	Student1(String n,int a){
		name=n;
		age=a;
	}
}
public class ConstructorOverloadingDay9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1();
		Student1 s2=new Student1("Bob");
		Student1 s3=new Student1("Bob",25);
		
		System.out.println(s1.name+" "+s1.age);
		System.out.println(s2.name+" "+s2.age);
		System.out.println(s3.name+" "+s3.age);
		
		
		
	}

}
