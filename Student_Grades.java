package day4;

import java.util.Scanner;

public class Student_Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the Student Average :");
		double Student_avg = sc.nextDouble();
		
		int Student_grade = (int) Student_avg;
		
		System.out.println("The Student Average is :"+Student_avg);
		System.out.println("The Student Grade is :"+Student_grade);
		
	}

}
