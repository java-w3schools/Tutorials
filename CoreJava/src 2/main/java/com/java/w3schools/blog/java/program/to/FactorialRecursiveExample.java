package com.java.w3schools.blog.java.program.to;

import java.util.Scanner;

/**
 * 
 * Iterative java program to find the factorial using Recursive concept.
 * 
 * @author JavaProgramTo.com
 *
 */
public class FactorialRecursiveExample {

	public static void main(String[] args) {

		System.out.println("Enter a number : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int factorialResult = factorial(n);

		System.out.println("Factorial value for " + n + " using recursive logic is : " + factorialResult);

	}

	/**
	 *
	 * Recursive function for factorial program.
	 * 
	 * @param n
	 * @return
	 */
	private static int factorial(int n) {

		if (n == 1)
			return 1;

		return n * factorial(n - 1);
	}

}
