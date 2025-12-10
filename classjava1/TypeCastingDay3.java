package classjava1;

import java.util.Scanner;

public class TypeCastingDay3 {

	public static void main(String[] args) {
// Type Casting and its Types
		
	// 1. Widening or implicit Type Casting - it will convert smaller to larger data type 
										//     with data and type
		//order of Implicit type casting - 
		//byte->short->int->long->float->double
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The byte : ");
		byte b=sc.nextByte();
		System.out.println("Byte"+" "+b);
		
		short s=b;
		System.out.println("Short"+" "+s);
		
		int i=s;
		System.out.println("Int"+" "+i);
		
		long l=i;
		System.out.println("Long"+" "+l);
		
		float f=l;
		System.out.println("Float"+" "+f);
		
		double d=f;
		System.out.println("Double"+" "+d);

	// 2. Narrowing or explicit Type Casting - it will convert larger to smaller data type 
		//     with data and type
		//order for explicit tyoe casting
		// double->float->long->int->short->byte
		
		double d1=123.456;
		System.out.println("Double"+" "+d1);

		float f1 = (float)d1;
		System.out.println("Float"+" "+f1);

		long l1 = (long)f1;
		System.out.println("Long"+" "+l1);

		int i1 = (int)l1;
		System.out.println("Int"+" "+i1);

		short s1 = (short)i1;
		System.out.println("Short"+" "+s1);

		byte b1 = (byte)s1;
		System.out.println("Byte"+" "+b1);

		
		
		

	}

}
