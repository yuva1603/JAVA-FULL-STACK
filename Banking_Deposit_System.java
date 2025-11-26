package day4;

import java.util.Scanner;

public class Banking_Deposit_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Balance In your Account : ");
		long balance=sc.nextLong();
		System.out.println("Enter The Interest per annun : ");
		float rate=sc.nextFloat();
		double finalBalance=balance + (balance * rate/100);
		
		System.out.println("The Balance You entered is : "+balance+" Rs");
		System.out.println("The Rate of interest you recived is :"+rate+"/annum");
		System.out.println("The Final Balance You Receive is : "+finalBalance);
	}

}
