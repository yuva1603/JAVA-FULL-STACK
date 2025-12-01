package programs.interview;

import java.util.Scanner;

public class ReverseA_NumberDay7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a NUmber to Reverse : ");
		int n=sc.nextInt(),rev=0;
		
		while(n>0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
			
		}
		 System.out.println("The revered Number is "+rev);
	}

}
