package day14;

import java.util.Scanner;

public class ArrayAddElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size ");
		int size=sc.nextInt();
		int[] a= new int[size+1];
		System.out.println("Enter the "+size+" elements for array");
		for(int i=0;i<a.length-1;i++) {
			System.out.println("Enter the "+i+" element of array");
			a[i]=sc.nextInt();
		}
		System.out.println("The Array is ");
		for(int i=0;i<a.length-1;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Enter the element to add");
		int newEl=sc.nextInt();
		System.out.println("New Array After element Added");
		for(int i=0;i<a.length;i++) {
			if(i!=a.length-1) {
				System.out.println(a[i]);
			} else {
				System.out.println(a[i]+newEl);
			}
		}
		
	}

}
