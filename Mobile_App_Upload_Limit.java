package day4;

import java.util.Scanner;

public class Mobile_App_Upload_Limit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Bytes to be Upload :");
		long bytes=sc.nextLong();
		long Mb = 1048576*100;
		long file = bytes*1048576;
		
		
		String Result=(file<Mb? "Ok Uploaded the File":"Error 100MB is Limit");
		
		System.out.println("The Entered Bytes is "+bytes+" MB");
		System.out.println(Result);
	}

}

