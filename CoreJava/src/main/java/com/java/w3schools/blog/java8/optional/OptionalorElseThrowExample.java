package com.java.w3schools.blog.java8.optional;

import java.util.Optional;

public class OptionalorElseThrowExample {

	public static void main(String[] args) {

		Optional<String> o = Optional.ofNullable("Hello");
		String value = o.orElseThrow();
		System.out.println("Getting value from optional : " + value);

		/*
		 * Optional<String> o2 = Optional.ofNullable(null); String value2 =
		 * o2.orElseThrow(); System.out.println("If optional value is null : " +
		 * value2);
		 */
		/*
		 * Optional<String> o3 = Optional.empty(); String value3 = o3.orElseThrow(() ->
		 * new AgeLimitException("Optional is empty. No age value is specified"));
		 * System.out.println("Optiona with custom exception " + value3);
		 */

		Optional<String> o4 = Optional.empty();
		String value4 = o4.orElseThrow(ArithmeticException::new);
		System.out.println("THrowing Arithmetic exception" + value4);

	}

}

class AgeLimitException extends RuntimeException {

	public AgeLimitException(String meg) {
		super(meg);

	}

}

/**

Output:

Getting value from optional : Hello
Exception in thread "main" java.lang.ArithmeticException
	at java.base/java.util.Optional.orElseThrow(Optional.java:408)
	at com.java.w3schools.blog.java8.optional.OptionalorElseThrowExample.main(OptionalorElseThrowExample.java:25)

*/
