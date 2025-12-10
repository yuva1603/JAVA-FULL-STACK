package classjava2;

public class CarOOPsDay8 //class
{
		String model; //attributes or data members or properties
		int year; //attributes or data members or properties
		
		
	void display() // method
	{ 
		System.out.println("car Model"+" "+model+"Year"+" "+year);	
		}
	public static void main(String args[]) {
		CarOOPsDay8 obj=new CarOOPsDay8();
		obj.model="tata";
		obj.year=1987;
		obj.display();
		
		obj.model="toyota";
		obj.year=1985;
		obj.display();
		
	}
}
