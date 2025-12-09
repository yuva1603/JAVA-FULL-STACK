package day12;

import java.util.Scanner;

class Pi
{
	static final float pi= 3.14f;
}

public class CircleFormula {
	Pi f=new Pi();
	static double circle(double a,double b) {
		b=Pi.pi*a*a;
		return b;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Area : ");
	double Area=sc.nextDouble();
	double Res=0;
	CircleFormula obj=new CircleFormula();
	double fin=obj.circle(Area, Res);
	System.out.println("The Area Of Circel is "+fin);
	}
}
