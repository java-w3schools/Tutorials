package com.java.w3schools.blog.streams.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * Example programs on Lambda Expressions.
 * 
 * @author Java-W3schools
 *
 */
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

/*Output:
	lambdaEmpList Before sorting : [Employee [id=100, salary=10000, designation=Software Engineer], Employee [id=101, salary=5000, designation=Junior SE], Employee [id=105, salary=6000, designation=Junior SE], Employee [id=110, salary=2500, designation=Intern]]
			lambdaEmpList after sorting : [Employee [id=110, salary=2500, designation=Intern], Employee [id=101, salary=5000, designation=Junior SE], Employee [id=105, salary=6000, designation=Junior SE], Employee [id=100, salary=10000, designation=Software Engineer]]
*/