package day9;

import java.util.Scanner;

class Employee{
	private int empId;
	private String name;
	private double salary;
	
	public String getName() {
		return name;
	}
	public int getId() {
		return empId;
	}
	public double getSalary() {
		return salary;
	}
	 public void setName(String newName) {
		 this.name=newName;
	 }
	 public void setId(int assignId) {
		 if(empId>0) {
		 this.empId=assignId;
		 	}
		 }
	 public void setSalary(double newSalary) {
		 this.salary=newSalary;
	 }
}
public class EmployeDetails {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee name : ");
		String name = sc.next();
		System.out.println("Enter the Employee ID : ");
		int empId = sc.nextInt();
		System.out.println("Enter the Employee Salary : ");
		double salary  = sc.nextDouble();
		Employee obj=new Employee();
		obj.setName(name);
		obj.setId(empId);
		obj.setSalary(salary);
		System.out.println("Employee Details");
		System.out.println("Employee name is "+obj.getName());
		System.out.println("Employee Id is "+obj.getId());
		System.out.println("Employee Salary is "+obj.getSalary());
	}
}
