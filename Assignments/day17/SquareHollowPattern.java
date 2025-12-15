package day17;

import java.util.Scanner;

public class SquareHollowPattern {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//System.out.println("Enter the number greater than 4 or equal to 4 :");
	int n= 5;//sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if((i==1)||(i==5)||(j==1)||(j==5)){
			System.out.print("* ");
			} else {
				System.out.print("  ");
			}
			
		}
		System.out.println();
	}
	}

}
