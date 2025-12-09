package day12;

import java.util.Scanner;

class MaxLimit
{
	static final int max=100;
}
public class CheckLimitUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxLimit l=new MaxLimit();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the current users count : ");
		int count=sc.nextInt();
		if(count <l.max) {
			System.out.println("The count is under the limit");
		} else {
			System.out.println("The Count Exceeds the max limit");
		}
	}

}
