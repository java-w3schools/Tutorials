package com.java.w3schools.blog.streams.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class NormalSorting {

	public static void main(String[] args) {

		Employee[] employees = { new Employee(100, 10000L, "Software Engineer"), new Employee(101, 5000L, "Junior SE"),
				new Employee(105, 6000L, "Junior SE"), new Employee(110, 2500L, "Intern") };

		List<Employee> empList = Arrays.asList(employees);
		List<Employee> lambdaEmpList = Arrays.asList(employees);

		/*
		 * System.out.println("empList Before sorting : " + empList); empList.sort(new
		 * Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) {
		 * 
		 * return o1.getSalary().compareTo(o2.getSalary()); } });
		 * 
		 * System.out.println("empList after sorting : " + empList);
		 */

		System.out.println("lambdaEmpList Before sorting : " + lambdaEmpList);
		lambdaEmpList.sort((Employee o1, Employee o2) -> o1.getSalary().compareTo(o2.getSalary()));
		System.out.println("lambdaEmpList after sorting : " + lambdaEmpList);

		LambdaInt lambdaInt = (Integer value) -> value.toString();

		LambdaInt lambdaInt2 = (Integer value) -> "String Value of ";
		
		Supplier<String> supplier = () -> "Java-W3schools";
		String str = supplier.get();
	}

	interface LambdaInt {
		public String getIntToString(Integer value);
	}
}
