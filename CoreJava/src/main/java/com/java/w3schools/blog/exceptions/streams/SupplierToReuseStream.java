package com.java.w3schools.blog.exceptions.streams;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Example program on Supplier Functional Interface (FI) Fix to
 * java.lang.IllegalStateException: stream has already been operated upon or
 * closed
 * 
 * @author Java-W3schools
 *
 */

public class SupplierToReuseStream {

	public static void main(String[] args) {

		// Creating Stream from String.
		String conent = "line 1 \n line 2 \\n line 3 \\n line 4 \\n line 5";
		Supplier<Stream<String>> supplier = () -> Stream.of(conent.split("\n"));

		// findFirst Operation
		Optional<String> firstValue = supplier.get().findFirst();
		System.out.println("firstValue : " + firstValue.get());

		// findAny Operation
		Optional<String> anyValue = supplier.get().findAny();
		System.out.println("anyValue : " + anyValue.get());
	}

}
