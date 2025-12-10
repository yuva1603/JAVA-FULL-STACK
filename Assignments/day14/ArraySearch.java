package day14;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size ");
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
		System.out.println("Enter the element to search index ");
		int elm=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(elm>0) {
				if(elm==a[i]) {
				System.out.println("The index of the element "+elm+" is "+i);
			        } 
				}else 
				{ 
					System.out.println("You value is error");
				}
	} 
}
}
