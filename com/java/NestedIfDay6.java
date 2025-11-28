package com.java;

import java.util.Scanner;

public class NestedIfDay6 {

	public static void main(String[] args) {
		// if(Condition1)
		//{
		//		(Condition 1 is true;
		
		//	if(condition2)
		//	{
		//			(condition1 and condition2 true);
		//	}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age=sc.nextInt();
		
		if(age>18) {
			if(age<60)
			{
				System.out.println("You are an Adult");
			}
		}
	}

}
