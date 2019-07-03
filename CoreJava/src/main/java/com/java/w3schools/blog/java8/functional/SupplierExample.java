package com.java.w3schools.blog.java8.functional;

import java.util.function.Supplier;

/**
 * Supplier Interface in Java with Examples
 * 
 * @author Venkatesh
 *
 */
public class SupplierExample {

	public static void main(String[] args) {

// This Supper always return a random value
		Supplier<Double> randomValue = () -> Math.random();
		System.out.println(randomValue.get());
	}
}