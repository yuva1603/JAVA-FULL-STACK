package day4;

import java.util.Scanner;

public class Online_Shopping_Bill_Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price of the product is ");
		double price = sc.nextDouble();
		
		System.out.println("Enter the Discount of the product You need : ");
		int discount = sc.nextInt();
		
		double final_price = price-(price*discount/100);

		
		System.out.println("The price of the product is "+price);
		System.out.println("The Discount of the product is  :"+discount );
		System.out.println("The Final Price is :"+final_price);
		
	}

}
