package com.codes;
import java.util.Scanner;

public class Swapping_Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first value");
		int a = sc.nextInt();
		
		System.out.println("Enter second value");
		int b = sc.nextInt();
		System.out.println("Value of first and second are: " + a+" and "+b);
			
		sc.close();
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Values after Reversal: "+ a + " and "+b);
	}

}
