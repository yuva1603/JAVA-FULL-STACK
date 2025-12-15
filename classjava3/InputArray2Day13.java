package classjava3;

import java.util.Scanner;

public class InputArray2Day13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = sc.nextInt();
		int[] a = new int[size];
		
		System.out.println("Enter the "+size+" Elements ");
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the "+i+" element");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array Elements ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		

	}

}
