package classjava2;
class Stud
{
	int id;
	String name;
	Stud(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	Stud(Stud s)
	{
		this.id=s.id;
		this.name=s.name;
	}
	void display()
	{
		System.out.println("ID"+" "+id);
		System.out.println("Name"+" "+name);
	}
}
public class CopyConstructorDay11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud s1=new Stud(100,"John");
		Stud s2=new Stud(s1);
		s1.display();
		s2.display();
	}

}
