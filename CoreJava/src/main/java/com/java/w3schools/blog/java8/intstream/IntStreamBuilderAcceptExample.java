package com.java.w3schools.blog.java8.intstream;

import java.util.stream.IntStream;

/**
 * Java 8 IntStream.Builder build() Methods Example
 * 
 * @author venkatesh
 *
 */
public class IntStreamBuilderAcceptExample {

	public static void main(String[] args) {

		IntStream.Builder intBuilder = IntStream.builder().add(3).add(6).add(9).add(12).add(15);

		
		IntStream intStream = intBuilder.build();
		intBuilder.accept(100);
		System.out.println("IntStream values generated from Builder");
		intStream.forEach(i -> System.out.println(i));
	}

}
