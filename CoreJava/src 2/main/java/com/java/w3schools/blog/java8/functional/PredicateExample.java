
package com.java.w3schools.blog.java8.functional;

import java.util.function.Predicate;

/**
 * Predicate Interface in Java with Examples
 * 
 * @author Venkatesh
 *
 */

public class PredicateExample {
	public static void main(String[] args) {

		Predicate<String> predicate = (String str) -> str.contains("Java");

		boolean isJavaDeveloper = predicate.test("Jhon is a Java Developer");

		if (isJavaDeveloper) {
			System.out.println("Yes, Jhon is a Java Developer. He can develop Java based web applications");
		} else {
			System.out.println("Jhob is not a Java developer.");
		}
	}
}