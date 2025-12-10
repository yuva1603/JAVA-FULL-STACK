package classjava1;

import java.util.Scanner;

public class MethodUsingVoid {
	
	public void printMsg(String message)
	{
		System.out.println("Your Message Is "+message);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Message ");
		String message = sc.nextLine();
		
		MethodUsingVoid obj = new MethodUsingVoid();
		obj.printMsg(message);
	}

}
