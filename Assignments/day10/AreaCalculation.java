package day10;

import java.util.Scanner;
class Area{
	public int area(int side) {
		return side*side;
	}
	public int area(int  len,int b) {
		return len*b;
	}
}
public class AreaCalculation {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Side value :");
		int side = sc.nextInt();
		Area obj=new Area();
		System.out.println("The value of side in square is "+obj.area(side)+"Ft");
		System.out.println("Enter the length value : ");
		int len=sc.nextInt();
		System.out.println("Enter the breadth value :");
		int b=sc.nextInt();
		System.out.println("The area of rectangle is :"+obj.area(len, b)+"ft");
		
	}

}
