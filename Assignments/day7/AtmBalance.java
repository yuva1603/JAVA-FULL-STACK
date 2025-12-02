package day7;

import java.util.Scanner;

public class AtmBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Option");
		System.out.println("Type 1 for Check balance ");
		int option=sc.nextInt();
		double limit = 1208.34;
		if(option == 1) {
			System.out.println("The balance is "+limit);		
			}
		System.out.println("Enter the amount you need to withdraw : ");
		int cash=sc.nextInt();
		int balance = (int)(limit-cash);
		if(cash>limit) {
			System.out.println("The Amount You entered is Out of Your Limit");
		}
		if(cash<limit) {
			System.out.println("You Successfully Withdrawn the "+cash+" And the Balance is "+balance);
		}
		
	
	}
		

}
