package Day6;

import java.util.Scanner;

public class MutiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to get its Table : ");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int res=num*i;
			System.out.println(num+"*"+i+"="+res);
		}
	}

}
