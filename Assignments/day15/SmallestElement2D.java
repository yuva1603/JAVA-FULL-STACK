package day15;
import java.util.Scanner;
public class SmallestElement2D {

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
				int min = arr[0][0]; 
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                if (arr[i][j] < min) {
		                    min = arr[i][j]; 
		                }
		            }
		        }
		        System.out.println("The Smallest Element of Array is "+min);
					
			}
		}

