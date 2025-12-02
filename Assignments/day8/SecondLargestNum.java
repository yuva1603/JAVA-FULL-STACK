package day8;

import java.util.Scanner;

public class SecondLargestNum {
	public static int SecondLargest(int n ,int  n2,int n3) {
		int res = 0;
		if((n2>n)&&(n2<n3)) {
			return n2;}
		if((n3>n2)&&(n3<n)) {
			return n3;}
		if((n>n3)&&(n<n2)) {
			return n;}
		return res;	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first integer : ");
		int num1 = sc.nextInt();
		System.out.println("Enter your Second integer : ");
		int num2=sc.nextInt();
		System.out.println("Enter your Third integer : ");
		int num3=sc.nextInt();
		
		SecondLargestNum obj=new SecondLargestNum();
		int res = obj.SecondLargest(num1, num2,num3);
		System.out.println("The Second Largest Number is "+res);
	}
}
