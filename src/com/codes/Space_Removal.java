package com.codes;
import java.util.Scanner;

public class Space_Removal {

	public static String space_removal(String input) {
		
		char[] character = input.toCharArray();
		
		//creating String from the output of the conditioned characters
		StringBuilder result = new StringBuilder();
		
		//Now making the condition to omit the spaces

		for (int i = 0; i<character.length; i++) {
			
			if(character[i] != ' ') {
				
				result.append(input.charAt(i));
			}
		}
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String userinput = sc.nextLine();
		
		System.out.println("The String with user inputs: " + userinput);
		
		System.out.println("The String without spaces is: " + space_removal(userinput));
		
		sc.close();
	}
}
