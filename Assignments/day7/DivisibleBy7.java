package day7;

import java.util.Scanner;

public class DivisibleBy7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to check if divisible by 7 :");
		int num=sc.nextInt();
		if(num%7==0) {
			System.out.println("The Number is Divisible by 7");
		} else {
			System.out.println("The Number is not divisible by 7");
		}
	}

}
