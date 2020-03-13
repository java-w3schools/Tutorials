package com.java.w3schools.blog.java.program.to;

import java.util.Scanner;

/**
 * 
 * Iterative java program to find the factorial using for loop
 * 
 * @author JavaProgramTo.com
 *
 */
public class FactorialExample {

	public static void main(String[] args) {

		System.out.println("Enter a number : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int factorialResult = 1;

		// using for loop
		for (int i = 1; i <= n; i++) {

			factorialResult = factorialResult * i;
		}

		System.out.println("Factorial value for " + n + " is : " + factorialResult);

	}

}
