package com.java.w3schools.blog.java.program.to;

/**
 * 
 * Java program to Sum of first 100 natural numbers using for loop
 * 
 * @author venkatesh
 *
 */
public class SumOfNaturalNumbersForLoop {

	public static void main(String[] args) {

		int n = 100;

		int naturalNumbersSum = 0;

		for (int index = 1; index <= n; index++) {
			naturalNumbersSum += index;
		}

		System.out.println("sum of frist 100 numbers: " + naturalNumbersSum);
	}

}
