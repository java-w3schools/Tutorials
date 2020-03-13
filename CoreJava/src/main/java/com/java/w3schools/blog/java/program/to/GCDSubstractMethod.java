package com.java.w3schools.blog.java.program.to;

import java.util.Scanner;

/**
 * 
 * Java Program to Find GCD of Two Numbers Using Subtraction method
 * 
 * @author JavaProgramTo.com
 *
 */
public class GCDSubstractMethod {

	public static void main(String[] args) {

		System.out.println("Enter a first number : ");
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();

		System.out.println("Enter a second number : ");
		int second = scanner.nextInt();

		while (first != second) {

			if (first > second) {
				first = first - second;
			} else {
				second = second - first;
			}
		}

		System.out.println("GCD : " + second);
	}

}
