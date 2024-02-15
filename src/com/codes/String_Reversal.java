package com.codes;
import java.util.Scanner;

public class String_Reversal {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		sc.close();
		String reversedString = reverseString(name);
		System.out.println("Reversed String is :" + reversedString);
	}
	
public static String reverseString(String input) {
		
		char[] reverse = input.toCharArray();
		
		for (int i=0, j = reverse.length-1; i<j; i++,j--) {
			char temp = reverse[i];
			reverse[i] = reverse[j];
			reverse[j] = temp;
		}
		 
		return new String (reverse);
		
	}
	
}