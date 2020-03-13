package com.java.w3schools.blog.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterator.OfDouble;
import java.util.Spliterator.OfInt;
import java.util.Spliterator.OfLong;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Java 8 StreamSupport Examples F
 * 
 * @author venkateshn
 *
 */
public class StreamSupportExamples {

	public static void main(String[] args) {

		System.out.println("Example 1");
		List<String> valuesList = new ArrayList<>();
		valuesList.add("java 8");
		valuesList.add("example");
		valuesList.add("blog");
		valuesList.add("2019");

		Stream<String> stream = StreamSupport.stream(valuesList.spliterator(), false);
		stream.forEach(System.out::println);

		System.out.println("\nExample 2");
		List<String> valuesList1 = new ArrayList<>();
		valuesList1.add("java 8");
		valuesList1.add("example");
		valuesList1.add("blog");
		valuesList1.add("2019");

		Stream<String> stream1 = StreamSupport.stream(valuesList1.spliterator(), true);
		stream1.forEach(System.out::println);

		System.out.println("\nExample 3");
		Set<String> valuesList2 = new TreeSet<>();
		valuesList2.add("java 8");
		valuesList2.add("example");
		valuesList2.add("blog");
		valuesList2.add("2019");

		Supplier<Spliterator> supplier = () -> valuesList2.spliterator();
		System.out.println("supplier characteristics value : " + supplier.get().characteristics());
		Stream<String> stream2 = StreamSupport.stream(() -> valuesList2.spliterator(), supplier.get().characteristics(),
				false);
		stream2.forEach(System.out::println);

		System.out.println("\nStreamSupport intStream example:");
		IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Supplier<OfInt> intSupplier = () -> intStream.spliterator();
		IntStream finalIntStream = StreamSupport.intStream(intSupplier, Spliterator.ORDERED, false);
		finalIntStream.forEach(System.out::println);

		System.out.println("\nStreamSupport intStream example:");
		DoubleStream doubleStream = DoubleStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Supplier<OfDouble> doubleSupplier1 = () -> doubleStream.spliterator();
		DoubleStream finalDoubleStream = StreamSupport.doubleStream(doubleSupplier1, Spliterator.ORDERED, false);
		finalDoubleStream.forEach(System.out::println);

		System.out.println("\nStreamSupport LongStream example:");
		LongStream longStream = LongStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Supplier<OfLong> longSupplier = () -> longStream.spliterator();
		LongStream finalLongStream = StreamSupport.longStream(longSupplier, Spliterator.ORDERED, false);
		finalLongStream.forEach(System.out::println);

	}

}
