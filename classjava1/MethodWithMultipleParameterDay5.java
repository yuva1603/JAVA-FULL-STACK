package classjava1;

import java.util.Scanner;

public class MethodWithMultipleParameterDay5 {
		public int add(int a,int b)
		{
			
			return a+b;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your First NUmber");
		int num1=sc.nextInt();
		System.out.println("Enter Your Second NUmber");
		int num2=sc.nextInt();
		
		MethodWithMultipleParameterDay5 obj=new MethodWithMultipleParameterDay5();
		int result=obj.add(num1,num2);
		System.out.println("Sum "+result);
	}

}
