package classjava1;

import java.util.Scanner;

public class EmployeeDetailsDay5 {
	int empId;
	String empName;
	double empSalary;
	
	public void setDetails(int id,String name,double Salary)
	{
		empId=id;
		empName=name;
		empSalary=Salary;
	}
	public void displayDetails()
	{
		System.out.println("Employee Id "+empId);
		System.out.println("Employee Name "+empName);
		System.out.println("Employee Salary "+empSalary);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeDetailsDay5 obj=new EmployeeDetailsDay5();
		System.out.println("Enter the Employee Id");
		int id=sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Enter the Employee Name");
		String name=sc.nextLine();
		
		System.out.println("Enter the Employee Salary");
		double Salary=sc.nextDouble();
		
		obj.setDetails(id, name, Salary);
		
		System.out.println("\n Employee Details ");
		obj.displayDetails();
		
	}
}
