package day5;

import java.util.Scanner;

public class StudentDetails {
		Scanner sc=new Scanner(System.in);
		
		String studentName=sc.nextLine();
		int studentId=sc.nextInt();
		String studentGrade=sc.next();
	
	public void setDetails(String name,int id,String grade)
	{
		studentName=name;
		studentId=id;
		studentGrade=grade;
	}
	public void displayDetails()
	{
		System.out.println("Student Name is "+studentName);
		System.out.println("Student Id is "+studentId);
		System.out.println("Student Grade is "+studentGrade);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the student Name ,Student Id , Student Grade  :");
		StudentDetails obj=new StudentDetails();
		obj.displayDetails();
	}

}
