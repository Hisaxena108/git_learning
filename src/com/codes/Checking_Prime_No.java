package com.codes;
import java.util.Scanner;

public class Checking_Prime_No {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the No. : ");
		 int a = sc.nextInt();
		 sc.close();
		 
		 if (isPrime(a)) {
			 
			 System.out.println("Given no. is a prime no.");
		 }
		 else
			 System.out.println("Given no. is not a prime no. ");
	}
	
	public static boolean isPrime(int input) {
		
		if (input<=1)
			return false;
		
		
		for (int i = 2; i<input; i++) {
			if (input%i == 0)
			return false; //not a prime no.
			
		}
		
		return true; //prime no.
		
	}

}
