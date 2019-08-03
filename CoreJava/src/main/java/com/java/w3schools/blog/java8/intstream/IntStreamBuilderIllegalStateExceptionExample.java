package com.java.w3schools.blog.java8.intstream;

import java.util.stream.IntStream;

/**
 * Java 8 IntStream.Builder IllegalStateException Example
 * 
 * @author venkatesh
 *
 */
public class IntStreamBuilderIllegalStateExceptionExample {

	public static void main(String[] args) {

		IntStream.Builder intStreamBuilder = IntStream.builder().add(300);
		IntStream intStream = intStreamBuilder.build();
		System.out.println("Build method is called and builder is closed. Not allowed to perform any operations");

		System.out.println("Trying to add values to builder");
		//intStreamBuilder.accept(150);
		
		IntStream intStream1 = intStreamBuilder.build();
		IntStream intStream2 = intStreamBuilder.build();
	}
}
