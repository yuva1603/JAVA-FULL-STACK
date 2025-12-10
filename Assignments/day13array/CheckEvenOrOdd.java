package day13array;

import java.util.Scanner;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size: ");
		int size=sc.nextInt();
		int[] a=new int[size];
		
		System.out.println("Enter the "+size+" Elements ");
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the "+i+" element");
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		int evenCount=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evenCount++;
			} 
		}
		int oddCount=0;
		for(int i=0;i<a.length;i++) {
			if(!(a[i]%2==0)) {
				oddCount++;
			}
		}
			
		System.out.println("Even Count is "+evenCount);
		System.out.println("Odd Count is "+oddCount);
	}

}
