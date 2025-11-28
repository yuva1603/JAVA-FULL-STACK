package com.java;

import java.util.Scanner;

public class ControlElseIfDay6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your marks ");
		int marks =sc.nextInt();
		
		//if(Condition1), If True
		//{Statement};
		if(marks>90) {
			System.out.println("A");
		}
		
		//else if(Condition2),if True
				//{Statement};
		else if(marks>80) {
			System.out.println("B");
		}
		
		//else if(Condition 3),If True
		//{Statement};
		else if(marks>70) {
			System.out.println("C");
		}
		
		//else if(Condition 4),If True
		//{Statement };
		else if(marks>60) {
			System.out.println("D");
		}
		
		else if(marks>50) {
			System.out.println("E");
		}
		else {System.out.println("FAIL");}
	}

}
