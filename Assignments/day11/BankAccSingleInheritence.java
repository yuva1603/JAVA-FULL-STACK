package day11;
import java.util.Scanner;
class BankAcc{
int accNum;
double balance;
void deposit(double amount) {
	if(amount > 0) {
		balance=2549.35;
		this.balance=balance+amount;
		System.out.println("Deposited New Balance "+balance);
	} else {
		System.out.println("Amount must be positive");
	}
}
void withdraw(double amount) {
	if(amount>0) {
		if(this.balance>=amount) {
			this.balance=balance-amount;
			System.out.println("The balance amount after withdraw is "+balance);
		} else { System.out.println("withdraw amount must positive");}
			} } }
class SavingsAcc extends BankAcc{
	double interestRate;
	void rate(double interestRate) {
		double interest = (this.balance*interestRate)/100;
		System.out.println("The interest rate reveived is :"+interest);
	} }	
public class BankAccSingleInheritence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAcc mySavings = new SavingsAcc();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to deposit : ");
		double amount=sc.nextDouble();
		System.out.println("Enter the amount to withdraw");
		double withdraw=sc.nextDouble();
		System.out.println("Enter the interest rate per annum :");
		double rate = sc.nextDouble();
		mySavings.deposit(amount);
		mySavings.withdraw(withdraw);
		mySavings.rate(rate); }
}
