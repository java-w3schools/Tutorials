package com.java.w3schools.blog.java.program.to;

/**
 * 
 * Java program to Sum of first 100 natural numbers using while loop
 * 
 * @author venkatesh
 *
 */
public class SumOfNaturalNumbersWhileLoop {

	public static void main(String[] args) {

		int n = 100;

		int naturalNumbersSum = 0;

		int index = 1;

		while (index <= n) {
			naturalNumbersSum += index;
			index++;
		}
		System.out.println("While Loop: Sum of frist 100 numbers: " + naturalNumbersSum);
	}

}
