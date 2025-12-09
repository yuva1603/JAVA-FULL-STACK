package day10;

import java.util.Scanner;

public class MethodOverLoadingAdd {
int add(int a,int b) {
	return a+b;
}
int add(int a,int b,int c) {
	return a+b+c;
}
float add(float a,float b) {
	return a+b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer a : ");
		int num1=sc.nextInt();
		System.out.println("Enter the integer b : ");
		int num2=sc.nextInt();
		System.out.println("Enter the integer c : ");
		int num3=sc.nextInt();
		System.out.println("Enter the integer f1 : ");
		float f1=sc.nextFloat();
		System.out.println("Enter the Interger f2 : ");
		float f2=sc.nextFloat();
		MethodOverLoadingAdd obj= new MethodOverLoadingAdd();
		int res1 =obj.add(num1,num2);
		int res2 = obj.add(num1,num2 ,num3);
		float res3 = obj.add(f1, f2);
		System.out.println("The addition of first two numbers "+res1);
		System.out.println("The addition of first three numbers "+res2);
		System.out.println("The addition of first two float numbers "+res3);
				
	}

}
