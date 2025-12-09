package day12;

import java.util.Scanner;

public class InterestCalc {
	public double simpleint(int a , float b, float c,double d) {
		d=a*c*b/100;
		return d;
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principal amount : ");
		int amt=sc.nextInt();
		System.out.println("Enter the Time Periof to calculate simple interest");
		float time=sc.nextFloat();
		final float interest = 12.5f;
		System.out.println("The rate of interest per annum is "+interest);
		InterestCalc i=new InterestCalc();
		double res=0;
		double SI =i.simpleint(amt, interest, time, res);
		System.out.println("The Simple interest for the "+amt+" "
				+ "is at the rate of "+interest+" Interest and Time of "+time+"Years Passed");
		System.out.println("The Simple interest is "+SI);
	}
}
