package com.codes;
import java.util.Scanner;

public class Fibonacchi_Series {

	public static void fibonacchi(int input) {
		
		int a = 0;
		int b = 1;
		
		System.out.print("Fibonacci series is: " + a+","+b);
		for (int i=3; i<=input; i++ ) {
			int temp = a;
			a = b;
			b = temp+a;
			System.out.print(","+b);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the No. ");
		int number = sc.nextInt();
		
		sc.close();
		fibonacchi(number);
		

	}

}
