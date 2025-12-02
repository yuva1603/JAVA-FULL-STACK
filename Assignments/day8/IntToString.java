package day8;

import java.util.Scanner;

public class IntToString {
	
	public static String IntToStr(int a) {
		String res=a+"";
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Int To return as String ");
		int a=sc.nextInt();
		String res="";
		IntToString obj=new IntToString();
		res=obj.IntToStr(a);
		System.out.println("The convered output is "+res);
		
	}

}
