package day5;

import java.util.Scanner;

public class CalculateTotal {
		public int total(int m1,int m2, int m3)
		{
			
			return (m1+m2+m3);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		CalculateTotal obj=new CalculateTotal();
		System.out.println("Enter the M1 Value :");
		int m1=sc.nextInt();
		System.out.println("Enter the M2 Value :");
		int m2=sc.nextInt();
		System.out.println("Enter the M3 Value :");
		int m3=sc.nextInt();
		
		int Total=obj.total(m1, m2, m3);
		System.out.println("The Total is "+Total);
	}

}
