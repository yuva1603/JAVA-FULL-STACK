package day16;

import java.util.Scanner;

public class PrimeNumbersDisplay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to list the prime number ");
		int n=sc.nextInt();
		System.out.println("Prime Numbers from 1 to "+n+" is : ");
		for (int i = 2; i <= n; i++) {
            boolean prime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i + " ");
            }
        }
	}
}
