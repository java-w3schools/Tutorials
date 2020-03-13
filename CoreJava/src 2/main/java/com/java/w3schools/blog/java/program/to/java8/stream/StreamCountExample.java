package com.java.w3schools.blog.java.program.to.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamCountExample {

	public static void main(String[] args) {
		Student cena = new Student(200, "Cena Jhon", 35);
		Student jack = new Student(201, "Jack", 40);
		Student ryan = new Student(202, "Ryan", 25);
		Student mithai = new Student(203, "Mithai", 17);
		Student paul = new Student(204, "Paul", 15);

		List<Student> students = new ArrayList<>();
		students.add(cena);
		students.add(jack);
		students.add(ryan);
		students.add(mithai);
		students.add(paul);

		long stuCount = students.stream().count();

		System.out.println("Students count: " + stuCount);

	}

}
