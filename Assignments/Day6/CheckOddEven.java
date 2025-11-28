package Day6;

import java.util.Scanner;

public class CheckOddEven { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Number to check even/odd");
		int number = sc.nextInt();
		if(number%2==0)
		{
			System.out.println("Number Is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}

}
