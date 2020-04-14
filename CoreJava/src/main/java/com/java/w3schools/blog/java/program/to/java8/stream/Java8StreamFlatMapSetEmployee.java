package com.java.w3schools.blog.java.program.to.java8.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.java.w3schools.blog.java8.stream.Employee;

/**
 * 
 * String[][] to String<Integer>
 * 
 * @author Java8Example
 *
 */

public class Java8StreamFlatMapSetEmployee {

	public static void main(String[] args) {

		Employee appleEmp1 = new Employee(100, "Jira Sunait", "Developer", "Apple");
		Employee appleEmp2 = new Employee(200, "Suman Jaran", "Lead", "Apple");
		Employee appleEmp3 = new Employee(300, "Riyad Paul", "Developer", "Apple");

		Set<Employee> appleSet = new HashSet<>();

		appleSet.add(appleEmp1);
		appleSet.add(appleEmp2);
		appleSet.add(appleEmp3);

		Employee samsungEmp1 = new Employee(400, "Baiym Chpal", "Developer", "Samsung");
		Employee samsungEmp2 = new Employee(500, "Atthat Gates", "Lead", "Samsung");

		Set<Employee> samsungSet = new HashSet<>();

		appleSet.add(samsungEmp1);
		appleSet.add(samsungEmp2);

		Set<Set<Employee>> allEmps = new HashSet<>();

		allEmps.add(appleSet);
		allEmps.add(samsungSet);

		Set<Employee> developers = allEmps.stream().flatMap(set -> set.stream())
				.filter(emp -> emp.getDesgnation().equals("Developer")).collect(Collectors.toSet());

		System.out.println("Filterting only developers from all companies as Set : " + developers);
		
		List<Employee> developerslist = allEmps.stream().flatMap(set -> set.stream())
				.filter(emp -> emp.getDesgnation().equals("Developer")).collect(Collectors.toList());

		System.out.println("Filterting only developers from all companies as List : " + developerslist);

	}

}
