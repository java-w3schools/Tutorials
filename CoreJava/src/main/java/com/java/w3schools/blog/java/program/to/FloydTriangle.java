package com.java.w3schools.blog.java.program.to;

import java.util.Scanner;

/**
 * 
 * Java Program to Print or Display Floyd’s Triangle With Example Output
 * 
 * @author javaprogramto.com venkatesh
 *
 */
public class FloydTriangle {

	public static void main(String[] args) {

		int totalNoOfRows, number = 1;

		// Reading the input from user.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows for floyd's triangle:");

		// storing the user input into a variable
		totalNoOfRows = scanner.nextInt();
		System.out.println("Floyd's triangle");
		System.out.println("********************");

		// row number is initialized to 1
		int rowNo = 1;

		for (rowNo = 1; rowNo <= totalNoOfRows; rowNo++) {
			for (int j = 1; j <= rowNo; j++) {
				System.out.print(number + " ");
				// Incrementing the number value
				number++;
			}
			// Moving the pointer to the new line
			System.out.println();
		}

	}

}
