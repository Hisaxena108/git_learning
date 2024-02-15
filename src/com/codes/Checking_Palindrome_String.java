package com.codes;
import java.util.Scanner;

public class Checking_Palindrome_String {

	public static String reversalOfString(String input) {
		
		char[] letter = input.toCharArray();
		
		for (int i=0, j= letter.length-1; i<j; i++,j-- ) {
			
			char temp = letter[i];
			letter[i] = letter[j];
			letter[j] = temp;
		}
		 return new String(letter);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String userinput = sc.nextLine();
		
		sc.close();
		
		if (userinput.equals(reversalOfString(userinput))){
			System.out.println("String is a palindrome");
	}
		else
			System.out.println("String is not a Palindrome");
	}

}
