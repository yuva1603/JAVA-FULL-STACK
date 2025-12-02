package day8;

import java.util.Scanner;

public class RemoveVowels {

	public static String Check (String input) {
        String result = ""; 
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);             
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                continue; 
            } else {
            	result = result + c;
            } }
        return result;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String Words :");
		String ch = sc.next();
		RemoveVowels obj=new RemoveVowels();
		String check = obj.Check(ch);
		System.out.println("The inputed String is : "+ch);
		System.out.println("The input after remove the vowels is "+check);
	}
}
