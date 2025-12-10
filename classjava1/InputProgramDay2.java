package classjava1;

import java.util.Scanner;

public class InputProgramDay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		// Integer Input
		System.out.println("Enter the integer");
		int i=sc.nextInt();
		System.out.println("The Integer is"+i);
		
		//Float Input
		System.out.println("Enter the float Value");
		float f=sc.nextFloat();
		System.out.println("the Float is "+f);
		
		//Short Input
		System.out.println("Enter the Short Value");
		short s=sc.nextShort();
		System.out.println("the SHort is "+s);
		
		//Double Input
		System.out.println("Enter the double Value");
		double d=sc.nextDouble();
		System.out.println("the Double is "+d);
		
		//Long Input
		System.out.println("Enter the Long Value");
		long l=sc.nextLong();
		System.out.println("the Float is "+l);
		
		//Char Input
		System.out.println("Enter the Char Value");
		char c=sc.next().charAt(0);
		System.out.println("the Char is "+c);
		
		//Boolean Input
		System.out.println("Enter the Boolean Value");
		boolean b=sc.nextBoolean();
		System.out.println("the Boolean is "+b);
		
		String str=sc.next(); 
		System.out.println("enter the name"+" "+str);
	}

}
