package classjava4;

import java.util.Scanner;

public class ExeceptionThrowDay17 {
	static void CheckAge(int age) {
		if(age<18) {
			throw new IllegalArgumentException("Access Denied");
		}
		else {
			System.out.println("Access Granted");
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the age : ");
		int age=sc.nextInt();
		CheckAge(age);
	}
	
}
