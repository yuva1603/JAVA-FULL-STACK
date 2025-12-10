package classjava1;

import java.util.Scanner;

public class OperatorsDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//a+b,a & b are operand ;+- operator
			System.out.println("Enter the Value for a ");
			int a=sc.nextInt();
			System.out.println("Enter the Value for b ");			
			int b=sc.nextInt();
			
			//arithmetic Operator(+,-,*,/)
			System.out.println("a+b= "+(a+b));
			System.out.println("a-b= "+(a-b));
			System.out.println("a*b= "+(a*b));
			System.out.println("a/b= "+(a/b));
			
			//Relational Operator (<,>,<=,>=,!=,%)
			System.out.println("a==b "+(a==b));
			System.out.println("a!=b= "+(a!=b));
			System.out.println("a>b "+(a>b));
			System.out.println("a<b "+(a<b));
			System.out.println("a<=b "+(a>=b));
			System.out.println("a>=b "+(a<=b));
			
			
			//Logical Operator (&&,!)
			boolean x=true,y=false;
			
			System.out.println("x&&y= "+(x&&y));
			System.out.println("x||y "+(x||y));
			System.out.println("!x= "+(!x));
			
			// Increment/Decrement Operator ()
			System.out.println("a "+a);
			System.out.println("a++ "+(a++)); //Post Increment (Shows increment value when we called)
			System.out.println("after a++ = "+a);
			
			System.out.println("a "+a);
			System.out.println("++a "+(++a));  //Pre Increment (Increment value immediatly)
			System.out.println("after ++a "+a);
			
			System.out.println("a "+a);
			System.out.println("a-- "+(a--)); //Post Decrement
			System.out.println("after a-- = "+a);
			
			System.out.println("a "+a);
			System.out.println("--a "+(--a));  //Pre Increment
			System.out.println("after --a "+a);
			
			//Assignment Operator (=,+=,-=,*=,/=)
			
			System.out.println("a+=9 "+(a+=9)); //a=a+9
			System.out.println("a-=9 "+(a-=9)); //a=a-9
			System.out.println("a*=9 "+(a*=9)); //a=a*9
			System.out.println("a/=9 "+(a/=9)); //a=a/9
			
			//Conditional Operator (Ternary Operator)
			System.out.println("Enter Your Age =");
			int age=sc.nextInt();
			String result=(age>=18?"Adult":"Minor");
			System.out.println("The Result is"+result);
	}

}
