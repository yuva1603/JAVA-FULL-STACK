package Day6;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get Sum Of Digits : ");
		int num = sc.nextInt();
		
		int sum = 0;

        while (num != 0) {
            int i = num % 10;   
            sum = sum + i;     
            num = num / 10;        
        }
        System.out.println("Sum of digits = " + sum);
			
	}

}
