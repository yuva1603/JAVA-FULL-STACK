package day8;

import java.util.Scanner;

public class BonusExperience {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Experience : ");
		int exp = sc.nextInt();
		
		
		if(exp>5) {
			System.out.println("Give 20% Bonus ");
		} else if(exp<5) {
			System.out.println("Give 10% Bonus ");			
		}
		else {
			System.out.println("Enter valid Experience ");
		}
	}

}
