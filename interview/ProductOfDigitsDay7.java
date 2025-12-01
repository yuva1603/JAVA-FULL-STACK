package programs.interview;

import java.util.Scanner;

public class ProductOfDigitsDay7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number to get Product Of Digits : ");
				int num = sc.nextInt();
				
				int sum = 1;

		        while (num> 0) {
		            int i = num % 10;   
		            sum = sum * i;     
		            num = num / 10;        
		        }
		        System.out.println("Product of digits = " + sum);
					
	}

}
