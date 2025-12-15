package classjava3;

import java.util.Scanner;

public class ArraySearchElementDay14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the [A] Array Size ");
		int size=sc.nextInt();
		int[] a= new int[size];
		System.out.println("Enter the "+size+" elements for array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("The Array is ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Enter the element to Search : ");
		int key=sc.nextInt();
		
		int flag=0;// 0-not found,1- found
		for(int i=0;i<size;i++) {
			if(a[i]==key) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Element Found in the array ");
		} else {
			System.out.println("Element not Found in the array ");
		}
	}

}
