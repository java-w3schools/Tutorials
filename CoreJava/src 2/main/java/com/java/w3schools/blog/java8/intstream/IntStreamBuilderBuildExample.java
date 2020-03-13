package com.java.w3schools.blog.java8.intstream;

import java.util.stream.IntStream;

/**
 * Java 8 IntStream.Builder build() Methods Example
 * 
 * @author venkatesh
 *
 */
public class IntStreamBuilderBuildExample {

	public static void main(String[] args) {

		IntStream.Builder intBuilder = IntStream.builder();
		intBuilder.accept(100);
		intBuilder.accept(200);
		intBuilder.accept(300);
		intBuilder.accept(400);
		intBuilder.accept(1500);

		intBuilder.add(222).add(333).add(444);

		IntStream intStream = intBuilder.build();
		System.out.println("IntStream values generated from Builder");
		intStream.forEach(i -> System.out.println(i));
	}

}
