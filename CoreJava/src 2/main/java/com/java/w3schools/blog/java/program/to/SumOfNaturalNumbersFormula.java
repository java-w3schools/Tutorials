package com.java.w3schools.blog.java.program.to;

import java.util.Scanner;

/**
 * 
 * Java program to calculate the Sum of first n natural numbers using arithmetic
 * formula
 * 
 * @author venkatesh
 *
 */
public class SumOfNaturalNumbersFormula {

	public static void main(String[] args) {

		System.out.println("Enter n value: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int naturalNumbersSum = n * (n + 1) / 2;

		System.out.println("Using arthemetic formula: Sum of frist 100 numbers: " + naturalNumbersSum);
	}

}
