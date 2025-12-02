package day8;

import java.util.Scanner;

public class ReturnNum {
	public static int LastNum(int num) {
		
		return num%10;
	}
	public static int FirstNum(int num) {
		while(num >= 10) {
			num=num/10;
		}
		return num;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your integer Minimum more than 3 digits : ");
		int number = sc.nextInt();
		ReturnNum obj=new ReturnNum();
		int res1 = obj.FirstNum(number);
		int res2 = obj.LastNum(number);
		System.out.println("The First Digit of "+number+" is "+res1);
		System.out.println("The Last Digit of "+number+" is "+res2);		
	}
}
