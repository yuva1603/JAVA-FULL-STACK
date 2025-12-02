package day7;

import java.util.Scanner;

public class Validate_Password {
	 public static boolean val(String password) {
	        if (password.length() < 6) {
	            return false;
	        }
	        boolean num = false;
	        for (int i = 0; i < password.length(); i++) {
	            if (Character.isDigit(password.charAt(i))) {
	                num = true;
	                break; 
	            }
	        }
	     return num;
	 }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Your Password :");
	        String password=sc.next();
	        if (val(password)) {
	            System.out.println("Password is valid.");
	        } else {
	            System.out.println("Password is not valid.");
	        }
	    }
	}



