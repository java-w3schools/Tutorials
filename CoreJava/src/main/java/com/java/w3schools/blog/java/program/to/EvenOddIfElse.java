package com.java.w3schools.blog.java.program.to;

import java.util.Scanner;

public class EvenOddIfElse {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number :");
		int number = scanner.nextInt();

		if (number % 2 == 0) {
			System.out.println(number + " is a even");
		} else {
			System.out.println(number + " is a odd");
		}

	}

}
