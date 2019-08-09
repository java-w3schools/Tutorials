
package com.java.w3schools.blog.java.collections;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * Java ConcurrentSkipListSet Examples
 * 
 * @author Venkatesh
 *
 */
public class ConcurrentSkipListSetExample {

	public static void main(String[] args) {

// ConcurrentSkipListSet with natural sorting
		ConcurrentSkipListSet<String> concurrentSkipListSet = new ConcurrentSkipListSet<>();
		concurrentSkipListSet.add("Y");
		concurrentSkipListSet.add("10");
		concurrentSkipListSet.add("A");
		concurrentSkipListSet.add("N");

		System.out.println("concurrentSkipListSet values : " + concurrentSkipListSet);

// ConcurrentSkipListSet with comparator
		ConcurrentSkipListSet<String> concurrentSkipListSetComparator = new ConcurrentSkipListSet<>(
				(s1, s2) -> s2.compareTo(s1));
		concurrentSkipListSetComparator.addAll(concurrentSkipListSet);

		System.out.println("concurrentSkipListSetComparator values : " + concurrentSkipListSetComparator);

// add example
		ConcurrentSkipListSet<String> skipSet = new ConcurrentSkipListSet<>();
		skipSet.add("Java");
		skipSet.add("World");
		skipSet.add("Hello");
		skipSet.add("Welcome");
		skipSet.add("to Java8Example");

		System.out.println("Added values: " + skipSet);

// clear() example

// skipSet.clear();
		System.out.println(skipSet.size());

//

		boolean found = skipSet.contains("Java");
		System.out.println("Java is found in set? " + found);

		found = skipSet.contains("Java 8");
		System.out.println("Java 8 is found in set? " + found);

// descendingIterator() example
		Iterator it = skipSet.descendingIterator();
		while (it.hasNext()) {
			System.out.println("Next value: " + it.next());
		}

// first()
		String firstValue = skipSet.first();
		System.out.println("firstValue : " + firstValue);

// isEmpty()
		boolean isSetEmpty = skipSet.isEmpty();
		System.out.println("skipSet empty check : " + isSetEmpty);

// iterator() example
		Iterator iterator = skipSet.iterator();
		while (iterator.hasNext()) {
			System.out.println("Natural Next value: " + iterator.next());
		}

// last()
		String lastValue = skipSet.last();
		System.out.println("lastValue : " + lastValue);

// remove()

		boolean javaRemoved = skipSet.remove("Java");
		boolean helloRemoved = skipSet.remove("hello");
		System.out.println("javaRemoved : " + javaRemoved);
		System.out.println("helloRemoved : " + helloRemoved);
		System.out.println("Set values after removal : " + skipSet);

// size()

		System.out.println("set size : " + skipSet.size());

		Spliterator<String> spliterator = skipSet.spliterator();
		spliterator.forEachRemaining(value -> System.out.println(value));

	}

}

/* Output:
concurrentSkipListSet values : [10, A, N, Y]
concurrentSkipListSetComparator values : [Y, N, A, 10]
Added values: [Hello, Java, Welcome, World, to Java8Example]
5
Java is found in set? true
Java 8 is found in set? false
Next value: to Java8Example
Next value: World
Next value: Welcome
Next value: Java
Next value: Hello
firstValue : Hello
skipSet empty check : false
Natural Next value: Hello
Natural Next value: Java
Natural Next value: Welcome
Natural Next value: World
Natural Next value: to Java8Example
lastValue : to Java8Example
javaRemoved : true
helloRemoved : false
Set values after removal : [Hello, Welcome, World, to Java8Example]
set size : 4
Hello
Welcome
World
to Java8Example
*/