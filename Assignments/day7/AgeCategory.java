package day7;

import java.util.Scanner;

public class AgeCategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age To Find Your Category :");
		int age=sc.nextInt();
		
		if(age<13) {
			System.out.println("Your age is under Child Category");
		}
		else if(age<20) {
			System.out.println("Your age is under Teenage Category");
		}
		else if(age<60) {
			System.out.println("Your age is under Adult Category");
		}
		else {
			System.out.println("Your age is under Senior Category");
		}
	}
}
