package classjava1;

import java.util.Scanner;

public class MethodParameterDay5 {
	
	//Method 1 with (No Parameter)
	
	public static void sayHello() //Method Definition
								  
	{
		System.out.println("Hello");
	}
	
	//Method 2 with  Single Parameter
	public static void greet(String name)
	{
		System.out.println("Hello"+"  "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHello(); //Method Calling
		greet("Yuvaraj");
		greet("Suri Flix");
	}

}