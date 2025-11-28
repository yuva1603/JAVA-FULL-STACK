package com.java;

import java.util.Scanner;

public class ControlIfDay6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your age :");
		int age=sc.nextInt();
		
		//If(Condition)
		//Statement
		if(age>=18)
		{
			System.out.println("I am eligible to vote");
		}
		
		if(age<18)
		{
			System.out.println("I am Not Eligible to vote");
			
		}
	}

}
