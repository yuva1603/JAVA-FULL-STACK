package day11;
import java.util.Scanner;

class Person{
	String name;
	int age;
}
class Employee extends Person{
	int empId;
	double salary;
}
class Manager extends Employee{
	String dept;
		public void display() {
			System.out.println("The person name is "+name);
			System.out.println("The person Age is :"+age);
			System.out.println("The Employee id is :"+empId);
			System.out.println("The Employee Salatry is :"+salary);
			System.out.println("The Department is "+dept);
		}
}

public class ManagementAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Manager m=new Manager();
		System.out.println("Enter the person name: ");
		m.name=sc.next();
		System.out.println("Enter the person age : ");
		m.age =sc.nextInt();
		System.out.println("Enter the Employee Id : ");
		m.empId=sc.nextInt();
		System.out.println("Enter the Employee Salary :");
		m.salary=sc.nextDouble();
		System.out.println("Enter the department name :");
		m.dept=sc.next();
		m.display();
	}
}
