package classjava3;

import java.util.Scanner;

public class MinimumArrayElementsDay13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = sc.nextInt();

		int sum =0;
		int[] a = new int[size];
		
		System.out.println("Enter the "+size+" Elements ");
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the "+i+" element");
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i]; // 
			}
		}
		System.out.println("Smallest elements is :"+min);
	}
}
