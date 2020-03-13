package com.java.w3schools.blog.java.program.to.java8.map;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Java program to collect User objects into List using stream map() function.
 * 
 * @author JavaProgramTo.com
 *
 */
public class StreamMapExample6 {

	public static void main(String[] args) {

		// Creating string stream using Stream.of() method.
		Stream<User> intValues = Stream.of(new User(500, "nag", "nag@gmail.com"),
				new User(700, "remo", "remo@gmail.com"), new User(900, "beri", "beri@gmail.com"));

		// list of user objects
		List<User> emailList = intValues.map(user -> {

			if (user.getEmail().contains("gmail.com")) {
				return user;
			} else
				return user;

		}).collect(Collectors.toList());

		// iterating final User list
		emailList.forEach(output -> System.out.println(output));

	}

}
