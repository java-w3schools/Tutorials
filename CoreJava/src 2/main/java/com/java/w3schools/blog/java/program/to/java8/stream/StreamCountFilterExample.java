package com.java.w3schools.blog.java.program.to.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamCountFilterExample {

	public static void main(String[] args) {
		Student cena = new Student(200, "Cena Jhon", 35);
		Student jack = new Student(201, "Jack", 40);
		Student ryan = new Student(202, "Ryan", 25);
		Student mithai = new Student(203, "Mithai", 17);
		Student paul = new Student(204, "Paul", 15);

		List<Student> students = Arrays.asList(cena, jack, ryan, mithai, paul);


		long methodRefFilterCount = students
											.stream()
											.filter(StreamCountFilterExample::validateAgeAndName)
											.count();

		System.out.println("Method Ref filters count: "+methodRefFilterCount);
		
	}
	
	public static boolean validateAgeAndName(Student student) {
		
		return student.getAge() > 20 && student.getName().contains("c");
		
	}

}
