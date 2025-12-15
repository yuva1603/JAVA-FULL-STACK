package day16;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year to check leap year or not : ");
		int year=sc.nextInt();
		int count =0;
		int n=year;
		while ((n) != 0) {
            n = n / 10; 
            count++;    
        }
		if(count==4) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
   	  }
   }

}
