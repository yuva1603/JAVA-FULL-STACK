package day10;

import java.util.Scanner;

class Emp{
	int id;
	int salary;
	String name;
	Emp(){
		System.out.println("There is No Employee");
	}
	Emp(int i){
		id=i;
		System.out.println("Employee Id is "+i);
	}
	Emp(int i,int s){
		id=i;
		salary=s;
		System.out.println("Employee id :"+i+" and the salary : "+s);
	}
	Emp(int i,int s,String n){
		id=i;
		salary=s;
		name=n;
		System.out.println("Employee id : "+i+" And Employee Salary : "+s+" And Employee Name :"+n);
	}
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee id: ");
		int id=sc.nextInt();
		System.out.println("Enter the Employee Salary: ");
		int salary=sc.nextInt();
		System.out.println("Enter the Employee Name: ");
		String name=sc.next();
		Emp e0=new Emp();
		Emp e1=new Emp(id);
		Emp e2=new Emp(id,salary);
		Emp e3=new Emp(id,salary,name);
		
	}

}
