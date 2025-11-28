package Day6;

import java.util.Scanner;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number [Any Number(like Whole Numbers includes)] : ");
		int number=sc.nextInt();
		if(number>0)
		{
			System.out.println("The Number is Positive ");
		}
	}

}
