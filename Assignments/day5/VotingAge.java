package day5;

import java.util.Scanner;

public class VotingAge {
	
	
	public static String check(int age) {
		
		return (age>=18?"Eligible":"Not Eligible");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		VotingAge obj = new VotingAge();
		System.out.println("Enter the age : ");
		int age=sc.nextInt();

		String result = check(age);
		System.out.println(result);
			
	}
}
