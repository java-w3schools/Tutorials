package com.java.w3schools.blog.java.program.to.java8.map;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Java program to collect all user email addresses into List using stream map()
 * function.
 * 
 * @author JavaProgramTo.com
 *
 */
public class StreamMapExample5 {

	public static void main(String[] args) {

		// Creating string stream using Stream.of() method.
		Stream<User> intValues = Stream.of(new User(100, "jhon", "jhon@gmail.com"),
				new User(200, "cena", "cena@gmail.com"), new User(300, "burg", "burg@gmail.com"));

		// list of email addresses
		List<String> emailList = intValues.map(user -> user.getEmail()).collect(Collectors.toList());

		// iterating final stream
		emailList.forEach(output -> System.out.println(output));

	}

}
