package day11;
import java.util.Scanner;
interface Payment{
	void pay(double amt);}
class CreditCard{
	void card(String num) {
		if(num.length()==16) {
			System.out.println("Payment Succesful");
		} else {
			System.out.println("Enter valid card details");
	} } }
class Upi extends CreditCard implements Payment{
	public void pay(double amt) {
		System.out.println("Enter the Amount to pay "+amt); }
	void scan(String id,int pin) {
		System.out.println("Wait till verify of upi id");
		int len=id.length();
		boolean check=false;
		for(int i=0;i<len;i++) {
			char c=id.charAt(i);
			if(c=='@') {
				check=true;
				break;}
			if(check=true) {
				System.out.println("Your Upi Id is Validated");
			} else {
				System.out.println("Enter the valid Upi pin");
			}}	
		if(pin==1603) {
			System.out.println("Payement Successful");
		} else {
			System.out.println("Enter the valid Upi pin"); } } }
public class PaymentGateway {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("The option to pay the bill is :");
		System.out.println("Enter the option (1 or 2)");
		System.out.println("1. Credit Card");
		System.out.println("2. UPI");
		int option=sc.nextInt();
		System.out.println("Enter the amount to be pay");
		int amt=sc.nextInt();
		CreditCard cc=new CreditCard();
		Upi u=new Upi();
		if(option==1) {
			System.out.println("Enter the card Number :");
			String num=sc.next();
			cc.card(num);
		} else if(option==2) {
			System.out.println("Enter the UPI Id :");
			String id=sc.next();
			System.out.println("Enter your Upi Pin");
			int pin=sc.nextInt();
			u.scan(id, pin);  }  }	}
