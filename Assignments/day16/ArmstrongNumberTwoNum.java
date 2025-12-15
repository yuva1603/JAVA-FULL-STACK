package day16;

import java.util.Scanner;

public class ArmstrongNumberTwoNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check Armstrong Number :");
		  int num = sc.nextInt();
	        int original = num;
	        int digits = 0;
	        int sum = 0;
	        while (num > 0) {
	            digits++;
	            num = num / 10;
	        }
	        num = original;
	        while (num > 0) {
	            int digit = num % 10;
	            int power = 1;
	            for (int i = 1; i <= digits; i++) {
	                power = power * digit;
	            }
	            sum = sum + power;
	            num = num / 10;
	        }
	        if (sum == original)
	            System.out.println(original + " is an Armstrong number");
	        else
	            System.out.println(original+" is not a Armstrong number ");
	}
}
