package classjava3;

import java.util.Scanner;

public class ArrayDuplicationDay14 {

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
		int s=0;
//		int eq=a[s];
		for(int i=0;i<a.length;i++) {
			if(!(a[i]==a[s])) {
				System.out.println("The no Duplicate element is "+a[i]);
				s++;
			}
			else if(a[i]==a[s]){
				System.out.println("There is duplicate ");
			}
		}
	}

}
