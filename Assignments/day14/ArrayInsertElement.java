package day14;

import java.util.Scanner;

public class ArrayInsertElement {

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
		System.out.println("Enter the Element to insert ");
		int elm=sc.nextInt();
		System.out.println("Enter the index to element need insert");
		int ind=sc.nextInt();
		System.out.println("The Array after insert in specific index :");
		int[] newArr=new int[size+1];
		for(int i=0;i<newArr.length;i++) {
		if(i<ind) {
				newArr[i]=a[i];
		} else if(i==ind) {
			newArr[i]=elm;
		} else if(i>ind) {
			newArr[i]=a[i-1];
		}
		System.out.println(newArr[i]);
		
		}
		
	}

}
