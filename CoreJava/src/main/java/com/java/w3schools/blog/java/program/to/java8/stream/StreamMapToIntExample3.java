package com.java.w3schools.blog.java.program.to.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class StreamMapToIntExample3 {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students.add(new Student(100, "Nani", 30));
		students.add(new Student(101, "priyanka arul", 25));
		students.add(new Student(102, "mohan", 35));
		students.add(new Student(103, "vikram kumar", 45));

		IntStream ageStream = students.stream().parallel().mapToInt(s -> s.getAge());

		List<Integer> ages = Collections.synchronizedList(new ArrayList<>());

		ageStream.forEach(ages::add);

		ages.forEach(age -> System.out.println(age));
	}

}
