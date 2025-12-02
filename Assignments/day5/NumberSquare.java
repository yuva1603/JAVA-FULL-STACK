package day5;

import java.util.Scanner;

public class NumberSquare {

	public static  void square(int a)
	{
		
		System.out.println("The Square of Number is "+(a*a));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value Of a :");
		int a=sc.nextInt();
		square(a);
		
	
	}

}
