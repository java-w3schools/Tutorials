package com.java.w3schools.blog.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.java.w3schools.blog.model.Employee;

public class AllMatchExample {

	public static void main(String[] args) {

		// Predicate to find the number are even.

		Stream<Integer> stream = Stream.of(2, 4, 6, 8, 10);

		Predicate<Integer> p1 = i -> i % 2 == 0;
		boolean isAllMatch = stream.allMatch(p1);
		System.out.println("isAllMatch for even numbers : " + isAllMatch);

		// Predicate to find the number are even.

		Stream<Integer> oddStream = Stream.of(2, 4, 6, 8, 10);

		Predicate<Integer> p2 = i -> i % 2 == 1;
		isAllMatch = oddStream.allMatch(p2);
		System.out.println("isAllMatch for odd numbers : " + isAllMatch);

		Employee employee1 = new Employee(1000, "Alan Joel");
		Employee employee2 = new Employee(2000, "Jhon Millon");

		List<Employee> empList = new ArrayList<>();
		empList.add(employee1);
		empList.add(employee2);

		Predicate<Employee> nameLengthPrediacate = e -> e.getName().length() > 0;
		boolean namelength = empList.stream().allMatch(nameLengthPrediacate);
		System.out.println("namelength allmatch : " + namelength);

		Predicate<Employee> namePrediacate = e -> e.getName().contains("Jhon");
		boolean nameMatch = empList.stream().allMatch(namePrediacate);
		System.out.println("nameMatch allmatch : " + nameMatch);

	}
}
