package com.java.w3schools.blog.arraylist.duplicate;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Removing duplicates from list using set.
 * 
 * @author venkatesh
 *
 */
public class RemovalUsingDistinct {

	public static void main(String[] args) {

		List<Employee> fewMonths = new ArrayList<>();
		fewMonths.add(new Employee(100, "Jhon"));
		fewMonths.add(new Employee(100, "Jhon"));
		fewMonths.add(new Employee(100, "Jhon"));
		fewMonths.add(new Employee(100, "Jhon"));
		fewMonths.add(new Employee(100, "Jhon"));

		System.out.println("Duplicate List size: " + fewMonths.size());

		List<Employee> newMonthsListWithoutDuplicates = fewMonths.stream().distinct().collect(Collectors.toList());
		System.out.println("After removing duplicates list size : " + newMonthsListWithoutDuplicates.size());
	}

}

/*Output:
	Duplicate List size: 5
	After removing duplicates list size : 1*/


class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// setters and getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

}