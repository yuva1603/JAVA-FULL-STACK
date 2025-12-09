package day10;

import java.util.Scanner;

class BankAccount{
	int accNum;
	String name;
	Float balance;
	BankAccount(){
		System.out.println("You have no Account in bank");
	}
	BankAccount(int a){
		accNum=a;
		System.out.println("The Accoun Number is "+a);
	}
	BankAccount(int a,String n){
		accNum=a;
		name=n;
		System.out.println("The Account NUmber is "+a+" and the account holder name is "+n);
	}
	BankAccount(int a,String n,float b){
		accNum=a;
		name=n;
		balance=b;
		System.out.println("The Account NUmber is "+a+" and the account holder name is "+n);
		System.out.println("The Opening balance is "+ b);
	}
}
public class BankDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account Number : ");
		int accNum=sc.nextInt();
		System.out.println("Enter the Account Holder Name : ");
		String name=sc.next();
		System.out.println("Enter the Opening Balance : ");
		float balance=sc.nextFloat();
		BankAccount b = new BankAccount();
		BankAccount b1 = new BankAccount(accNum);
		BankAccount b2 = new BankAccount(accNum,name);
		BankAccount b3 = new BankAccount(accNum,name,balance);
		
	}

}
