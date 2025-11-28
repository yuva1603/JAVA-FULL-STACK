package com.java;

public class SumOfFirst5Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the Number ");
		int num=0;
		int sum=0;
		
		while(num<=5)
		{
			sum=sum+num;
			num++;
		}
		System.out.println("the sum is "+sum);	
	}

}
