package day7;

import java.util.Scanner;

public class TemperaturCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Temperature : ");
		float temp=sc.nextFloat();
		if(temp>30) {
			System.out.println("The temperature is "+temp+" and above refered as HOT !!");
		}
		else if(((temp>=20||temp<=29))) {
			System.out.println("The Temperature is "+temp+" is refered as WARM ");
		}
		else if(temp<=10) {
			System.out.println("The Temperature is "+temp+"refered as COLD");
		}
	}

}
