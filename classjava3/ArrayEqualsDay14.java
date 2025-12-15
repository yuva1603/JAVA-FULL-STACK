package classjava3;

import java.util.Scanner;

public class ArrayEqualsDay14 {
	public static boolean arrayEquals(int[] a,int[] b) {
		if(a.length!=b.length) {
			return false;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println(arrayEquals(a,b));
	}

}
