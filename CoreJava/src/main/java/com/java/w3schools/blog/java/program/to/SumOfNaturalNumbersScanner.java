package com.java.w3schools.blog.java.program.to;

import java.util.Scanner;

/**
 * 
 * Java program to calculate the Sum of first n natural numbers. where n is
 * taken from the user.
 * 
 * @author venkatesh
 *
 */
public class SumOfNaturalNumbersScanner {

	public static void main(String[] args) {

		System.out.println("Enter n value: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int naturalNumbersSum = 0;

		for (int index = 1; index <= n; index++) {
			naturalNumbersSum += index;
		}

		System.out.println("While Loop: Sum of frist 100 numbers: " + naturalNumbersSum);
	}

}
