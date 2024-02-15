package com.codes;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Checking_Odd_No {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> input = new ArrayList<>();
		
		System.out.println("Enter the Size of the List: ");
		
		int size = sc.nextInt();
		
		System.out.println("enter "+size+" numbers");
		
		for (int i=0; i<size; i++) {
			
			input.add(sc.nextInt());
		}
		
		sc.close();
		boolean result = containsOnlyOdd(input);
		
		if (result)
			System.out.println("The given list contains only odd number");
		
		else
			System.out.println("The given number have atleast one even number");
	}
	
	
	public static boolean containsOnlyOdd(List<Integer> numbers) {
		
		for (int num : numbers) {
			
			if (num%2 == 0) {
				
				return false;
			}
				
		}
		return true;
	}

}
