package com.codes;
import java.util.Scanner;

public class String_Contains_Vowels {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String name = sc.nextLine();
		sc.close();
		
		if (vowelsDetermination(name)) {
			
			System.out.println("Your string contains Vowels");
		}
		
		else
			System.out.println("Your string doesn't have the vowel");
	}
		
	public static boolean vowelsDetermination(String input) {
		
		//Making the string case insensitive
		input = input.toLowerCase();
		
		//returning in boolean and contains is the method in java
		return input.contains("a") || input.contains("e") || input.contains("i") || input.contains("o") || input.contains("u");
		
	}
		
	}


