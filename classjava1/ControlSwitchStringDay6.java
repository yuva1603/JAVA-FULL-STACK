package classjava1;

import java.util.Scanner;

public class ControlSwitchStringDay6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any one RGB Colors (small caps only) : ");
		String colors=sc.next();
		switch(colors) {
		case "red":
		{System.out.println("The Color Is Red");
		break;}
		
		case "green":
		{System.out.println("The Color Is Green");
		break;}
		
		case "blue":
		{System.out.println("The Color Is Blue");
		break;}
		
		default:
		{System.out.println("INVALID");}
		}
	}

}
