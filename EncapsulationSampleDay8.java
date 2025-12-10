package classjava2;

class Name{

	private String name;
	private int id;
	private int age;
	
	//getter
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	
	//setter
	public void setName(String newName) 
	{
		this.name= newName;
	}
	public void assignId(int newId)
	{
		if(newId>0) {
			this.id=newId;
		}
	}
	public void setAge(int newAge) 
	{
		if(newAge>0) {
		this.age= newAge;}
	}
}
	
	public class EncapsulationSampleDay8 {
	public static void main(String[] args) {
		
		//implementation of encapsulation 
		//1. variables declared as private
		//2. getter --- method to access 
		//   setter --- method to modify
		Name obj=new Name();
		obj.setName("Suriya");
		obj.setAge(22);
		obj.assignId(1);
		System.out.println("Name is "+" "+obj.getName());
		System.out.println("Age is "+" "+obj.getAge());
		System.out.println("Id is "+" "+obj.getId());


	}

}
