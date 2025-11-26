package day4;

import java.util.Scanner;

public class Sensor_Data_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Temperature :");
		float Orginal_temp = sc.nextFloat();
		
		int Converted_temp = (int) Orginal_temp;
		
		System.out.println("The entered Temperatur "+Orginal_temp);
		System.out.println("The Converted Temperatur "+Converted_temp);

		
	}

}
