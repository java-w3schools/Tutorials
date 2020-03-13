package com.java.w3schools.blog.string;

import java.util.stream.Stream;

/**
 * Example program on java 11 lines() method.
 * 
 * @author Venkatesh
 *
 */
public class StringLinesExample {

	public static void main(String[] args) {

		String content = "hello\njava\nworld";
		Stream<String> lines = content.lines();
		lines.forEach(line -> System.out.println("line : " + line));

		//System.out.println("Returned Stream size: " + lines.toArray().length);
		
		
		String value = "welcome to Java-w3schools blog";
		Stream<String> stream =  value.lines();
		stream.forEach(line -> System.out.println(line));
		
		System.out.println("-----------------LIne Terminators ---\n-----------------");
		String withLineTerminators = "Very gald \nto meet you \nMr. Jhon Cena";
		Stream<String> lineTeminatorStream =  withLineTerminators.lines();
		lineTeminatorStream.forEach(line -> System.out.println(line));

		System.out.println("-----------------LIne Terminators ---\r-----------------");
		String carrierLineTerminators = "Very gald \nto meet you \nMr. Jhon Cena";
		Stream<String> carrierTeminatorStream =  carrierLineTerminators.lines();
		carrierTeminatorStream.forEach(line -> System.out.println(line));
		
		System.out.println("-----------------LIne Terminators ---\r\n-----------------");
		String bothLineTerminators = "Very gald \r\nto meet you \r\nMr. Jhon Cena";
		Stream<String> bothTeminatorStream =  bothLineTerminators.lines();
		bothTeminatorStream.forEach(line -> System.out.println(line));
	}
}

/*Output:
	line : hello
	line : java
	line : world
	welcome to Java-w3schools blog
	-----------------LIne Terminators ---
	-----------------
	Very gald 
	to meet you 
	Mr. Jhon Cena
	-----------------LIne Terminators ---
	-----------------
	Very gald 
	to meet you 
	Mr. Jhon Cena
	-----------------LIne Terminators ---
	-----------------
	Very gald 
	to meet you 
	Mr. Jhon Cena
*/