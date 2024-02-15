package com.codes;
import java.util.Scanner;

public class Extra_Space_Removal {	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = sc.nextLine();
		
		String output = input.trim();
		
		sc.close();
		System.out.println("Trimmed output of the input String "+input+" is : " + output);
	}

}
