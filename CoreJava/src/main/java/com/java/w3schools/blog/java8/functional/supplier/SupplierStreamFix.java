package com.java.w3schools.blog.java8.functional.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierStreamFix {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Mango", "Jack Fruit", "Water Melon", "Apple");
		Stream<String> stream = fruits.stream();

		Optional<String> anyFruitName = stream.findAny();
		System.out.println(anyFruitName.get());

		Supplier<Stream<String>> streamSupplier = () -> fruits.stream();

		Stream<String> anyStream = streamSupplier.get();
		System.out.println("anyStream " + anyStream.findAny().get());

		Stream<String> firstStream = streamSupplier.get();
		System.out.println("firstStream : " + firstStream.findAny().get());

		// Mehtod Reference

		Supplier<String> methodRef = String::new;

	}

}

class Table {
	public Table() {
		// TODO Auto-generated constructor stub
	}
}