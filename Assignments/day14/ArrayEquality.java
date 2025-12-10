package day14;

import java.util.Scanner;

public class ArrayEquality {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the [A] Array Size ");
		int size=sc.nextInt();
		int[] a= new int[size];
		System.out.println("Enter the "+size+" elements for array");
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the "+i+" element of array");
			a[i]=sc.nextInt();
		}
		System.out.println("The Array is ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("Enter the [B] Array Size ");
		int size1=sc.nextInt();
		int[] b= new int[size1];
		System.out.println("Enter the "+size1+" elements for array");
		for(int i=0;i<b.length;i++) {
			System.out.println("Enter the "+i+" element of array");
			b[i]=sc.nextInt();
		}
		System.out.println("The Array is ");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		int count=0;
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]==b[i]) {
					count++;
				}
			}
			if(count==a.length) {
				System.out.println("Arrays are Equal");
			} else {
				System.out.println("Arrays are not Equal");
			}
		} else {
			System.out.println("Arrays are not equal");
		}
		
	}

}
