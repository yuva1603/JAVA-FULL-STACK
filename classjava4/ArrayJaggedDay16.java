package classjava4;

import java.util.Scanner;

public class ArrayJaggedDay16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of rows : ");
		int rows=sc.nextInt();
		
		int[][] arr=new int[rows][];
		
		System.out.println("Enter "+rows+" Elements ");
		for(int i=0;i<rows;i++) {
		System.out.println("Enter the number of column for rows : "+" "+i);
		
		int cols=sc.nextInt();
		arr[i]=new int[cols];//Jagged Array
		
		for(int j=0;j<cols;j++) {
			System.out.println("Enter the element ["+i+"] ["+j+"]");
			arr[i][j]=sc.nextInt();		
			}
		}
		System.out.println("Jagged Array");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
