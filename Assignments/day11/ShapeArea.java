package day11;

import java.util.Scanner;

class Shape{
	void formula() {
		System.out.println("The two formulas are :");
	}
}
class Circle extends Shape{
	public static double circle(int a) {
		double res=((3.14)*(a*a));
		return  res;
 }
}
class Rectangle extends Shape{
	public static long rect(int a,int b) {
		long res1=a*b;
		return res1;
	}
}
public class ShapeArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius of Circle :");
		int radius=sc.nextInt();
		System.out.println("Enter the lenght of Rectangle : ");
		int len=sc.nextInt();
		System.out.println("Enter the width of rectangle : ");
		int width=sc.nextInt();
		Rectangle r=new Rectangle();
		long res= r.rect(len, width);
		r.formula();
		System.out.println("Area of rectange is "+res);
		Circle c=new Circle();
		double res1 =c.circle(radius);
		System.out.println("Area of Circle is "+res1);
	}
}
