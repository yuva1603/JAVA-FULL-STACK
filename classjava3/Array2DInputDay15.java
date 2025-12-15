package classjava3;

import java.util.Scanner;

public class Array2DInputDay15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the rows ");
		int rows=sc.nextInt();
		
		System.out.println("Enter the cols ");
		int cols=sc.nextInt();
		
		int[][] arr=new int[rows][cols];
		
		System.out.println("Enter the Array elements : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("Enter the "+i+" and "+j+" element");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The Array elements is :");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
