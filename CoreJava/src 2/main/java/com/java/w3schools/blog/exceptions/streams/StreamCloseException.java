package com.java.w3schools.blog.exceptions.streams;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Example 1 to throw java.lang.IllegalStateException: stream has already been operated upon or closed
 * 
 * @author Java-W3schools
 *
 */
public class StreamCloseException {

	public static void main(String[] args) {

		// Creating Stream from String.
		String conent = "line 1 \n line 2 \\n line 3 \\n line 4 \\n line 5";
		Stream<String> mainStream = Stream.of(conent.split("\n"));

		// Operation on mainStream
		Optional<String> firstValue = mainStream.findFirst();
		System.out.println("firstValue : " + firstValue.get());

		// Operation on mainStream

		Optional<String> anyValue = mainStream.findAny();
		System.out.println("anyValue : " + anyValue.get());

	}

}
