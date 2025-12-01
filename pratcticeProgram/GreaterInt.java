package pratcticeProgram;

import java.util.Scanner;

public class GreaterInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Integer");
		int num1=sc.nextInt();
		System.out.println("Enter the second Integer");
		int num2=sc.nextInt();
		int res=num1+num2;
		if(res>50) {
			System.out.println("The Result is greater than Fifty");
		} else {System.out.println("The result is Less than fifty");}
		
		if(res>10||res<20) {
			System.out.println("The result is between 10-20");
		}
		else if(res>20||res<30) {
			System.out.println("The result is between 20-30");
		}
		
		else if(res>30||res<40){
			System.out.println("The result is between 30-40");
		}
		
		else if(res>40||res<50) {
			System.out.println("The result is between 40-50");
		}
		
		for(int i=2;i<=7;i++) {
			if(res%i==0) {
			System.out.println("The Number is divisible by "+i+"is"+res);
		}
			if(num1>0&&num2>0) {
			int rev1=0,rev2=0;
			while(num1>0) {
				int d1=num1%10;
				 rev1=rev1*10+d1;
				num1=num1/10;	
			}
			while(num2>0) {
				int d2=num2%10;
				rev2=rev2*10+d2;
				num2=num2/10;
			}
			 System.out.println("The revered Number is "+rev1);
			 System.out.println("The revered Number is "+rev2);
		}
			}
	}
}



