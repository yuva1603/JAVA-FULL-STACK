package com.java;

import java.util.Scanner;

public class FindNumberDay6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number Any : ");
		int num =sc.nextInt();
		
		if(num>0)
		{System.out.println("Number is positive");}
		else if(num==0)
		{
			System.out.println("Number is Zero");
		}
		else
		{
			System.out.println("Number is negative");
		}
		
	}

}
