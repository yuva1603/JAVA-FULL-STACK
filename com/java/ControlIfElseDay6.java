
package com.java;

import java.util.Scanner;

public class ControlIfElseDay6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		//if(Condition),If True
		// {Statments: }
		
		//else,if false
		//{Statement};
		
		if(age>=18)
		{
			System.out.println("I am Eligible to Vote");
		}
		else
		{
			System.out.println("I am not Eligible to Vote");
		}
	}
}
