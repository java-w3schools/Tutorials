package com.java.w3schools.blog.java.program.to;

import java.util.Scanner;

/**
 * 
 * Java Program to Find GCD of Two Numbers using and Running a for loop till
 * minimum of two numbers
 * 
 * @author JavaProgramTo.com
 *
 */
public class GCDForLoop {

	public static void main(String[] args) {

		System.out.println("Enter a first number : ");
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();

		System.out.println("Enter a second number : ");
		int second = scanner.nextInt();

		// executing a for loop till min of two numbers.

		int min = Math.min(first, second);
		int gcd = 1;
		for (int i = 1; i <= min; i++) {

			if (first % i == 0 && second % i == 0) {
				gcd = i;
			}
		}

		System.out.println("GCD of two numbers (" + first + ", " + second + ") is : " + gcd);

	}

}
