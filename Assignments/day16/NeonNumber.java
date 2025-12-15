package day16;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input number : ");
		int n=sc.nextInt();
		int sum=0;
		int res=n*n;
		int d;
		while(res>0) {
				d=res%10;
				sum=sum+d;
				res=res/10;
		}
			if(n==sum) {
				System.out.println("It is A Neon number ");
			} else {
				System.out.println("Not a Neon Number");
		}
	}

}
