package programs.interview;

import java.util.Scanner;

public class AvgOf5NumberDay7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 1 :");
		int num1=sc.nextInt();
		System.out.println("Enter the number 2 :");
		int num2=sc.nextInt();
		System.out.println("Enter the number 3 :");
		int num3=sc.nextInt();
		System.out.println("Enter the number 4 :");
		int num4=sc.nextInt();
		System.out.println("Enter the number 5 :");
		int num5=sc.nextInt();
	
		float res = num1+num2+num3+num4+num5/5;
		System.out.println("The Avg is "+res);
		
	}
	

}
