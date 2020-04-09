package com.java.w3schools.blog.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Find employee object with max salary.
 * 
 * @author javaprogramto.com
 *
 */
public class ArrayListCustomObjectMaxValue {

	public static void main(String[] args) {

		// creating list with type Employee.
		List<Employee> empOfList = new ArrayList<>();

		// adding values
		empOfList.add(new Employee(100, 45, 250000));
		empOfList.add(new Employee(109, 38, 15000));
		empOfList.add(new Employee(108, 23, 330000));
		empOfList.add(new Employee(111, 55, 873983));
		empOfList.add(new Employee(103, 25, 908022));
		empOfList.add(new Employee(102, 35, 87272));

		// calling max() method.
		Employee max = Collections.max(empOfList);
		System.out.println("ArrayList max value : " + max.getSalary() + " for emp id : " + max.getId());
	}
}

class Employee implements Comparable<Employee> {

	private int id;
	private int age;
	private long salary;

	public Employee(int id, int age, long salary) {
		super();
		this.id = id;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public long getSalary() {
		return salary;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.getSalary() > o.getSalary()) {
			return 1;
		} else if (this.getSalary() < o.getSalary()) {
			return -1;
		}
		return 0;
	}

}