package day15;

import java.util.Scanner;

public class EvenOddCountArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows ");
		int rows=sc.nextInt();
		System.out.println("Enter the cols ");
		int cols=sc.nextInt();
		int[][] arr=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("Enter the "+i+" element "+j+" element");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The Arrays in 2D Dimensional is : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int oddCount=0;
		int evenCount=0;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(arr[i][j]%2==0) {
					evenCount++;
				} else {
					oddCount++;
				}
			}
		}
		System.out.println("The Even count of array Elements is "+evenCount);
		System.out.println("The Odd count of array Elements is "+oddCount);
	}
}
