package Assignments;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Employee Name");
		String str=sc.next();
		System.out.println("Enter Your Employee ID");
		int id=sc.nextInt();
		System.out.println("Enter Your Employee Salary");
		double sal=sc.nextDouble();
		System.out.println("Enter Your Employee Designation");
		String Des=sc.next();
		System.out.println("Enter Your Employee City");
		String City=sc.next();
		
		
		System.out.println("*********EMPLOYEE DETAILS**********");
		System.out.println("Employee Name "+" "+str);
		System.out.println(" Employee ID"+" "+id);
		System.out.println(" Salary "+" "+sal);
		System.out.println("Employee Designation "+" "+Des);
		System.out.println(" Employee City "+" "+City);
	}

}
