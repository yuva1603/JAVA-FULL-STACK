package day5;

import java.util.Scanner;

public class MarksConverter {

	public static String getGrade(int marks) {

	    return (marks >= 90) ? "O" :
	           (marks >= 80) ? "A" :
	           (marks >= 70) ? "B" :
	           (marks >= 60) ? "C" :
	           (marks >= 50) ? "D" :
	           (marks >= 40) ? "E" :
	           "F";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Marks : ");
		int marks=sc.nextInt();
		MarksConverter obj=new MarksConverter();
		obj.getGrade(marks);
		System.out.println(getGrade(marks));
	}

}
