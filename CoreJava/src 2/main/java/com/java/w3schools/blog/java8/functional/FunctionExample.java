package com.java.w3schools.blog.java8.functional;

import java.util.function.Function;

/**
 * Function Interface in Java with Examples
 * 
 * @author Venkatesh
 *
 */
class FunctionExample {
	public static void main(String[] args) {
		Function<String, String> function = (String input) -> input.substring(5);
		String output = function.apply("This is a test Funtion interface in java 8");
		System.out.println(output);
	}
}