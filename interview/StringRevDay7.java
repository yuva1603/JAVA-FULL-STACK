package programs.interview;

import java.util.Scanner;

public class StringRevDay7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String to Reverse ");
		String original = sc.next();
		String rev="";
		for(int i=original.length()-1;i>=0;i--)
		{
			rev=rev+original.charAt(i);
		}
		System.out.println("The Reverse String is : "+" "+rev);
	}

}
