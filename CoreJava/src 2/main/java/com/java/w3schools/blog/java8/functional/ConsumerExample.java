package com.java.w3schools.blog.java8.functional;

import java.util.function.Consumer;

/**
 * Consumer Interface in Java with Examples
 * 
 * @author venkatesh
 *
 */
public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = (String value) -> {
			System.out.println(value.toUpperCase());
		};
		consumer.accept("Welcome to Java W3schools blog");
	}
}
