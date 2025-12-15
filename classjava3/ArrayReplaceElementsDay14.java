package classjava3;

import java.util.Scanner;

public class ArrayReplaceElementsDay14 {
	public static void main(String[] args) {
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
				System.out.println("Enter the element to Replace : ");
				int oldValue=sc.nextInt();
				System.out.println("Enter the new Value ");
				int newValue=sc.nextInt();
				for(int i=0;i<a.length;i++) {
					if(a[i]==oldValue) {
						a[i]=newValue;
						break;
					}
				}
				for(int x:a) {
					System.out.println(x+" ");
				}

	}

}
