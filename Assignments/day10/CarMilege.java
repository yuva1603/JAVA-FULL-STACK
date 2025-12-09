package day10;

import java.util.Scanner;

class Car{
	String name;
	float mileage;
	String fuel;
	Car(){
		System.out.println("First Buy a Car");
	}
	Car(String n){
		name=n;
		System.out.println("The name of the car is : "+n);
	}
	Car(String n,Float m){
		name=n;
		mileage=m;
		System.out.println("The car name : "+n+" and the mileage is : "+m);
	}
	Car(String n,Float m,String f){
		name=n;
		mileage=m;
		fuel=f;
		System.out.println("The car name is "+n+" it gives mileage "+m);
		System.out.println("The fuel Type is "+f);
	}
}
public class CarMilege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Car model name ");
		String name=sc.next();
		System.out.println("Enter the mileage of your car :");
		float mileage=sc.nextFloat();
		System.out.println("Enter the fuel type of your car");
		String fuel=sc.next();
		 Car c=new Car();
		 Car c1=new Car(name);
		 Car c2=new Car(name,mileage);
		 Car c3=new Car(name,mileage,fuel);
	}

}
