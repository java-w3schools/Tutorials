package com.java.w3schools.blog.java.program.to.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamCountFilterMetRefExample {

	public static void main(String[] args) {
		Student cena = new Student(200, "Cena Jhon", 35);
		Student jack = new Student(201, "Jack", 40);
		Student ryan = new Student(202, "Ryan", 25);
		Student mithai = new Student(203, "Mithai", 17);
		Student paul = new Student(204, "Paul", 15);

		List<Student> students = Arrays.asList(cena, jack, ryan, mithai, paul);

		long elegibleStudents = students.stream().filter(s -> s.getAge() > 18).count();

		System.out.println("Eligible Students count: " + elegibleStudents);

		long ageGreaterThan40Years = students
											.stream()
											.filter(s -> s.getAge() > 40)
											.count();
		
		System.out.println("Age > 40 years students: " + ageGreaterThan40Years);
		

		long multipleFilterCount = students
											.stream()
											.filter(s -> s.getAge() > 20 && s.getName().contains("c"))
											.count();

		System.out.println("Multiple filters count: "+multipleFilterCount);
	}

}
