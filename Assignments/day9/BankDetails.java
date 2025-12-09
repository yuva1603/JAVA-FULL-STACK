package day9;

import java.util.Scanner;

class BankAccount{
	private int account;
	private double balance;

public int getAccount() {
	return account;
}
public double getBalance() {
	return balance;
}
public void setAccount(int newAccount) {
	this.account=newAccount;
}
public void setBalance(double newBalance) {
	if(newBalance>balance) {
		this.balance=newBalance;
	}
}
}
public class BankDetails {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Account number");
		int accNum = sc.nextInt();
		System.out.println("Enter Your Account Balance :");
		double Balance = sc.nextDouble();
		// TODO Auto-generated method stub
		BankAccount obj = new BankAccount();
		obj.setAccount(accNum);
		obj.setBalance(Balance);
		System.out.println("Your Account Number is : "+"IOB"+obj.getAccount());
		System.out.println("Your Balance is : "+obj.getBalance());
		
	}

}
