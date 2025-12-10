package classjava1;

import java.util.Scanner;

public class ControlSwitcDay6 {

	public static void main(String[] args) {
		//Switch(expression)
		//		case value1:
		//Code to be Executed
		//break;(optional)
		
		
		//default:
		// code to be executed
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day of the Week (1 - 7): ");
		int dayofweek=sc.nextInt();
		
		switch(dayofweek) {
		//case value1
				//		code to be executed
				//      break;
		case 1:
		{System.out.println("Monday");
		break;}
		
		//case value2
				//		code to be executed
				//      break;
		case 2:
		{System.out.println("Tuesday");
		break;}
		
		case 3:
		{System.out.println("Wednesday");
		break;}
		
		case 4:
		{System.out.println("Thursday");
		break;}
		
		case 5:
		{System.out.println("Friday");
		break;}
		
		case 6:
		{System.out.println("Saturday");
		break;}
		
		case 7:
		{System.out.println("Sunday");
		break;}
		
		default:
		{System.out.println("INVALID");}
		}
	}
}
