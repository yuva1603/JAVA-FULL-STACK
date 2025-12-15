package day16;

import java.util.Scanner;

public class InputCheckString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the inpto check is ther number or not :");
		String s=sc.next();
		boolean check=false;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch=='0')||(ch<='9')) {
				check=true;
			} else {
				check=false;
			}
		}
			if(check==true) {
				System.out.println("Your input has number");
			} else {
				System.out.println("Your input has no number ");
			}
	} 
}
