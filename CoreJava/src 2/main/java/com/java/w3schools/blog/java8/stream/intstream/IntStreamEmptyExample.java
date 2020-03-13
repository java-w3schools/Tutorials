package com.java.w3schools.blog.java8.stream.intstream;

import java.util.stream.IntStream;

/**
 * 
 * Example program to create an empty intstream.
 * 
 * @author venkatesh nukala
 *
 */
public class IntStreamEmptyExample {

	public static void main(String[] args) {

		IntStream emptyIntStrweam = IntStream.empty();
		long count = emptyIntStrweam.count();
		System.out.println("Created instream size: " + count);

	}

}
/*
 * Output: Created instream size: 0
 */