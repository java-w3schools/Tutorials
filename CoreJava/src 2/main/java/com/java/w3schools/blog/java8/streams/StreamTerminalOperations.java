package com.java.w3schools.blog.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream api terminal operations of java 8
 * 
 * @author java-w3schools
 *
 */
public class StreamTerminalOperations {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

		// Stream toArray() Method Example
		Object[] objArray = stream.toArray();
		System.out.println("objArray length " + objArray.length);

		// Stream collect() Method Example
		Stream<Integer> streamCOllect = Stream.of(1, 2, 3, 4, 5);

		List<Integer> intList = streamCOllect.collect(Collectors.toList());
		// Set<Integer> intSet = streamCOllect.collect(Collectors.toSet());
		// Long count = streamCOllect.collect(Collectors.counting());

		// Stream count() Method Example
		Stream<Integer> streamCount = Stream.of(1, 2, 3, 4, 5);
		Long count = streamCount.count();
		System.out.println("count :: " + count);

		// Stream count() Method Example
		Stream<Integer> streamReduce = Stream.of(1, 2, 3, 4, 5);
		Optional<Integer> sum = streamReduce.reduce((value1, value2) -> value1 + value2);
		System.out.println("sum of first 5 numbers using reduce opration : " + sum.get());

		// Stream forEach() Method Example
		Stream<Integer> streamForEach = Stream.of(1, 2, 3, 4, 5).parallel();
		// Printing the values
		// streamForEach.forEach(value -> System.out.println(value));

		// Adding values to list.
		List<Integer> numList = new ArrayList<>();
		streamForEach.forEach(value -> numList.add(value));
		System.out.println("numList : " + numList);

		// Stream streamForEachOrdered() Method Example
		Stream<Integer> streamForEachOrdered = Stream.of(1, 2, 3, 4, 5).parallel();
		// Printing the values
		streamForEachOrdered.forEachOrdered(value -> System.out.println(value));

		// Adding values to list.
		Stream<Integer> streamForEachOrderedList = Stream.of(1, 2, 3, 4, 5).parallel();
		List<Integer> numList1 = new ArrayList<>();
		streamForEachOrderedList.forEachOrdered(value -> numList1.add(value));
		System.out.println("numList1 : " + numList1);

		// Stream min() Method Example
		Stream<Integer> streamMin = Stream.of(1, 2, 3, 4, 5).parallel();
		Optional<Integer> min = streamMin.min((v1, v2) -> v1.compareTo(v2));
		System.out.println("Min value : " + min.get());

		// Stream max() Method Example
		Stream<Integer> streamMax = Stream.of(1, 2, 3, 4, 5).parallel();
		Optional<Integer> max = streamMax.max((v1, v2) -> v1.compareTo(v2));
		System.out.println("Max value : " + max.get());

		// Stream anymatch() Method Example
		Stream<Integer> streamAnymatch = Stream.of(1, 2, 3, 4, 5).parallel();
		Predicate<Integer> anymatch = value -> value > 4;
		boolean isAnymatch = streamAnymatch.anyMatch(anymatch);
		System.out.println("anymatch value : " + isAnymatch);

		// Stream allmatch() Method Example
		Stream<Integer> streamAllmatch = Stream.of(1, 2, 3, 4, 5).parallel();
		Predicate<Integer> allmatch = value -> value > 2;
		boolean isAllmatch = streamAllmatch.allMatch(allmatch);
		System.out.println("allmatch value : " + isAllmatch);

		// Stream noneMatch() Method Example
		Stream<Integer> streamNoneMatch = Stream.of(1, 2, 3, 4, 5).parallel();
		Predicate<Integer> nonematch = value -> value > 7;
		boolean isNoneMatch = streamNoneMatch.noneMatch(nonematch);
		System.out.println("noneMatch method returned value : " + isNoneMatch);

		// Stream findAny() Method Example
		Stream<Integer> streamFindAny = Stream.of(1, 2, 3, 4, 5).parallel();
		Predicate<Integer> findAny = value -> value % 2 == 1;
		Optional<Integer> findAnyOpt = streamFindAny.filter(findAny).findAny();
		System.out.println("Find any odd number : " + findAnyOpt.get());

		// Stream findFirst() Method Example
		Stream<Integer> streamFindFirst = Stream.of(1, 2, 3, 4, 5).parallel();
		Predicate<Integer> findFirst = value -> value % 2 == 0;
		Optional<Integer> findFirstOpt = streamFindFirst.filter(findFirst).findFirst();
		System.out.println("Find first odd number : " + findFirstOpt.get());

	}

}


/**

Output:
objArray length 5
count :: 5
sum of first 5 numbers using reduce opration : 15
numList : [3, 1, 4, 2, 5]
1
2
3
4
5
numList1 : [1, 2, 3, 4, 5]
Min value : 1
Max value : 5
anymatch value : true
allmatch value : false
noneMatch method returned value : true
Find any odd number : 1
Find first odd number : 2

*/