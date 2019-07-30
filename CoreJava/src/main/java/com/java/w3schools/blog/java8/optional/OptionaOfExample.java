package com.java.w3schools.blog.java8.optional;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * java 8 Optional of() method example
 * 
 * @author venkatesh
 *
 */
public class OptionaOfExample {

	public static void main(String[] args) {
// Integer optional Example
		Optional<Integer> intOptional = Optional.of(10);
		System.out.println("Integer type optional using of(Integer) method : " + intOptional.get());

// Float optional Example
		Optional<Float> floatOptional = Optional.of(134.789f);
		System.out.println("Integer type optional using of(Float) method : " + floatOptional.get());

// String optional Example
		Optional<String> stringOptional = Optional.of("hello world in java 8");
		System.out.println("Integer type optional using of(String) method : " + stringOptional.get());

// List optional Example
		List<String> names = Arrays.asList("David", "Fernad", "Julia", "Zara", "David");
		Optional<List<String>> listOptional = Optional.of(names);
		System.out.println("Integer type optional using of(List<String>) method : " + listOptional.get());

// Set optional Example
		Set<String> namesSet = new HashSet<>(names);
		Optional<Set<String>> setOptional = Optional.of(namesSet);
		System.out.println("Integer type optional using of(Set<String>) method : " + setOptional.get());

		Optional optional = Optional.of(null);

	}

}

/** 
Integer type optional using of(Integer) method : 10
Integer type optional using of(Float) method : 134.789
Integer type optional using of(String) method : hello world in java 8
Integer type optional using of(List&lt;String&gt;) method : [David, Fernad, Julia, Zara, David]
Integer type optional using of(Set&lt;String&gt;) method : [Julia, David, Fernad, Zara]
Exception in thread "main" java.lang.NullPointerException
at java.base/java.util.Objects.requireNonNull(Objects.java:221)
at java.base/java.util.Optional.&lt;init&gt;(Optional.java:107)
at java.base/java.util.Optional.of(Optional.java:120)
at com.java.w3schools.blog.java8.optional.OptionaOfExample.main(OptionaOfExample.java:40)
*/