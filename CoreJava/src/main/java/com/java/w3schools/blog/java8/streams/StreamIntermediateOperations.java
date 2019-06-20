package com.java.w3schools.blog.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * 
 * @author Java-W3schools
 *
 */
public class StreamIntermediateOperations {

	public static void main(String[] args) {

		System.out.println("--------------------------------");
		// Filter Operation.
		Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5);
		Stream<Integer> subStream = intStream.filter(value -> value > 3);
		long count = subStream.count();
		System.out.println(count);

		System.out.println("--------------------------------");
		// map() Operation
		Stream<String> strStream = Stream.of("Welcome", "To", "java", "blog");
		Stream<String> subStream2 = strStream.map(string -> {
			if (string == "java")
				return "Java-W3schools";
			return string;
		});
		List<String> welomeList = subStream2.collect(Collectors.toList());
		System.out.println(welomeList);

		System.out.println("--------------------------------");
		// flatmap() Operation
		List<String> summerFruits = Arrays.asList("Mango", "Jack Fruit", "Water Melon", "Apple");
		List<String> winterFruits = Arrays.asList("Apple", "orage", "gauva");

		Stream<List<String>> stream = Stream.of(summerFruits, winterFruits);

		Stream<String> flatStream = stream.flatMap(list -> list.stream());
		// flatStream.forEach(str -> System.out.println(str));
		long distinctFruites = flatStream.distinct().count();
		System.out.println(distinctFruites);

		System.out.println("--------------------------------");
		// distinct() Operation
		Stream<String> fruitsStream = Stream.of("Apple", "Jack Fruit", "Water Melon", "Apple");
		Stream<String> distinctStream = fruitsStream.distinct();
		distinctStream.forEach(name -> System.out.println(name));

		System.out.println("--------------------------------");
		// sort() Operation
		Stream<String> vegStream = Stream.of("tomoto", "Green Chilli", "Pototo", "Beet root");
		Stream<String> sortedStream = vegStream.sorted();
		sortedStream.forEach(name -> System.out.println(name));

		System.out.println("--------------------------------");
		// peek() Operation
		Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());

		System.out.println("--------------------------------");
		// limit() Operation
		Stream.of("one", "two", "three", "four").limit(2).forEach(item -> System.out.println(item));

		System.out.println("--------------------------------");
		// skip() Operation
		Stream.of("one", "two", "three", "four", "five").skip(2).forEach(item -> System.out.println(item));

	}

}

/*Output:
	--------------------------------
	2
	--------------------------------
	[Welcome, To, Java-W3schools, blog]
	--------------------------------
	6
	--------------------------------
	Apple
	Jack Fruit
	Water Melon
	--------------------------------
	Beet root
	Green Chilli
	Pototo
	tomoto
	--------------------------------
	Filtered value: three
	Mapped value: THREE
	Filtered value: four
	Mapped value: FOUR
	--------------------------------
	one
	two
	--------------------------------
	three
	four
	five
*/