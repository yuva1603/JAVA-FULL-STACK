package pratcticeProgram;

import java.util.Scanner;

public class CalcUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Integer");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Integer");
		int num2=sc.nextInt();
		boolean condition = true;
		
		while(condition) {
		
		System.out.println("Choose an Operation");
		System.out.println("1. Addition(+)");
		System.out.println("2. Subtraction(-)");
		System.out.println("3. Multiplication(*)");
		System.out.println("4. Division(/)");
		
		int choice=sc.nextInt();
		int result;
		
		switch(choice) {
		case 1:
			result=num1+num2;
			System.out.println("Result: "+result);
			break;
			
		case 2:
			result=num1-num2;
			System.out.println("Result: "+result);
			break;
			
		case 3:
			result=num1*num2;
			System.out.println("Result: "+result);
			break;
			
		case 4:
			if(num2!=0) {
			result=num1/num2;
			System.out.println("Result: "+result);}
			else {
				System.out.println("Enter the Valid Number ");
			}
			break;
			
		default:
			System.out.println("Invalid Choice,ENter Between 1-4  ");
		}
		System.out.println("If You Want to Continue ? ");
		System.out.println("Options");
		System.out.println("1. Yes");
		System.out.println("2. No");
		String ch=sc.next();
		if(ch=="yes") {
			condition=true;
		}else {
			condition = false;
			System.out.println("Program exited");
		}

		}
		
		
	}

}
