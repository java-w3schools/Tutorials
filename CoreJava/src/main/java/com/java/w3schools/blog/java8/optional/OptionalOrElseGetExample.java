package com.java.w3schools.blog.java8.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalOrElseGetExample {

	public static void main(String[] args) {

		// optional non empty
		Optional<List<String>> listOptional = Optional.of(Arrays.asList("one", "two", "three"));

		List<String> orELseList = listOptional.orElseGet(() -> {
			List<String> list = new ArrayList<String>();
			list.add("Four");
			return list;
		});

		System.out.println("Optional is not empty : " + orELseList);

		// optional empty
		Optional<List<String>> emptyOptional = Optional.empty();

		List<String> orELseGetList = emptyOptional.orElseGet(() -> {
			List<String> list = new ArrayList<String>();
			list.add("Four");
			return list;
		});
		System.out.println("For empty optional resulst : " + orELseGetList);
		orElseGet();
	}

	public static void orElseGet() {

		// optional non empty
		Optional<Integer> listOptional = Optional.of(12345);

		Integer value = listOptional.orElseGet(() -> -999);

		System.out.println("Optional not empty integer value : " + value);

		// optional empty
		Optional<Integer> emptyOptional = Optional.empty();

		Integer orELseGetList = emptyOptional.orElseGet(() -> -999);
		System.out.println("For empty optional result : " + orELseGetList);

	}

}
