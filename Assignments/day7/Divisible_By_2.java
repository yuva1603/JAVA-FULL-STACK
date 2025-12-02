package day7;

import java.util.Scanner;

public class Divisible_By_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Integer to find the divisible count : ");
        int num = sc.nextInt();
        int count=0;
        
        while(num%2==0) {
        	num=num/2;
        	count++;	
        }
        System.out.println("The count is "+count);
        
    }
}

