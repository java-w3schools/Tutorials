
package com.java.w3schools.blog.java8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * java 8 Optional filter() method example
 * 
 * @author Venkatesh
 *
 */
public class OptionalFilterExample {

	public static void main(String[] args) {

		Optional<String> helloOptonal = Optional.of("Hello Mate, Welcome to java8example blog");

		// Predicate match case
		Predicate<String> welcomePredicate = s -> s.contains("Welcome");
		Optional<String> welcomeOptional = helloOptonal.filter(welcomePredicate);
		System.out.println("welcomeOptional : " + welcomeOptional);

		// Predicate non-match case
		Predicate<String> haiPredicate = s -> s.contains("Hai");
		Optional<String> haiOptional = helloOptonal.filter(haiPredicate);
		System.out.println("haiOptional : " + haiOptional);

		// List to Optioanl
		List<String> countries = Arrays.asList("USA", "UK", "AUS");
		Optional<List<String>> countriesOptional = Optional.of(countries);

		Predicate<List<String>> listPredicate = list -> list.stream().filter(name -> name.startsWith("U")).count() > 0;

		Optional listOpional = countriesOptional.filter(listPredicate);
		System.out.println("List Optional filter() : " + listOpional);
	}
}

/**
 * Output: welcomeOptional : Optional[Hello Mate, Welcome to java8example blog]
 * haiOptional : Optional.empty List Optional filter() : Optional[[USA, UK,
 * AUS]]
 * 
 */
