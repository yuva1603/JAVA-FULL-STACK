package day14;

import java.util.Scanner;

public class RemoveArrayElement {

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
		System.out.println("Enter the element To remove : ");
		int rem=sc.nextInt();
		int[] temp=new int[a.length];
		System.out.println("Array After Removed element is ");
		for(int i=0;i<a.length;i++) {
			if(rem!=a[i]) {
				temp[i]=a[i];
				System.out.println(temp[i]);
			} else { 
				System.out.println("The Removed element index is "+i);
			}
			}
	}
	}
