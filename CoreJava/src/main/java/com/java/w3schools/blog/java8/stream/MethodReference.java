package com.java.w3schools.blog.java8.stream;

import java.util.function.Consumer;

public class MethodReference {

	public static void main(String[] args) {

		Consumer<String> methodRef = (o) -> o.toString();

		// rewritten above as below.
		Consumer<String> objConcumer = Object::toString;

		// constructor
		Consumer<String> constrConsumer = String::new;

		// Static method reference:
		Consumer<String> staticConsumer = String::toString;

		// Unbound instance method reference:		
		Consumer<String> value2 = String::toString;

	}

}
