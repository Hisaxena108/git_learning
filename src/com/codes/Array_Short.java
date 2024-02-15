package com.codes;
import java.util.Scanner;
import java.util.Arrays;

public class Array_Short {

	public static void main(String[] args) {

		System.out.println("Enter the no. of elment you wanted to short: ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Object[] array = new Object[n];
		
		for(int i = 0; i<n; i++) {
			
			System.out.println("Enter the next element" + (i+1) + ": ");
			if (sc.hasNextInt()) {
				array[i] = sc.nextInt();
			}
			else {
				array[i] = sc.next();
			}
		}
		
		Arrays.sort(array);
		
		sc.close();
		
		for (Object element : array)
		System.out.print(element + ", ");
	}

}
