package com.java.w3schools.blog.java8.functional.supplier;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

/**
 * Example program on IntSupplier
 * 
 * @author venkateshn
 *
 */
public class IntSupplierExamples {

	public static void main(String[] args) {

		// Example 1
		IntSupplier intSupplier = () -> Integer.MIN_VALUE;
		System.out.println("Integer Min value " + intSupplier.getAsInt());

		// Example 2
		int[] intArray = { 0 };
		IntSupplier incremenntSupplier = () -> ++intArray[0];

		System.out.println(incremenntSupplier.getAsInt());
		System.out.println(incremenntSupplier.getAsInt());
		System.out.println(incremenntSupplier.getAsInt());

		// Example 3

		// Declaring 3 int array's
		int previous[] = { 0 };
		int current[] = { 1 };
		int nextValue[] = { 1 };

		// writing fibonaci logic inside IntSupplier
		IntSupplier fibSupplier = () -> {
			nextValue[0] = previous[0] + current[0];
			previous[0] = current[0];
			current[0] = nextValue[0];
			return previous[0];
		};

		// Generating IntStream by calling 15 times fibSupplier and print the value
		// returned by fibSupplier.
		IntStream.generate(fibSupplier).limit(15).peek(str -> System.out.print(" ")).forEach(System.out::print);

	}

}

/*
 * Output: 
 * Integer Min value -2147483648 
 * 1 2 3 
 * 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
 */