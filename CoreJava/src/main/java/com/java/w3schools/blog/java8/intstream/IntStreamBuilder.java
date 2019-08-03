package com.java.w3schools.blog.java8.intstream;

import java.util.stream.IntStream;

/**
 * Java 8 IntStream.Builder Methods Examples
 * 
 * @author venkatesh
 *
 */
public class IntStreamBuilder {

	public static void main(String[] args) {

		// builder object creation.
		IntStream.Builder builder = IntStream.builder();
		builder.add(10);
		builder.add(30);
		builder.add(50);
		builder.add(70);
		builder.add(90);

		System.out.println(builder);

		IntStream.Builder newBuilder = IntStream.builder().add(0).add(5).add(10).add(15).add(20);
		System.out.println(newBuilder);

		IntStream intStream = builder.build();
		intStream.forEach(i -> System.out.println(i));
	}

}
