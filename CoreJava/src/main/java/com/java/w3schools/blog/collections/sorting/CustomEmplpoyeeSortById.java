package com.java.w3schools.blog.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomEmplpoyeeSortById {

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<>();

		emps.add(new Employee(2001, "Modi", 55));
		emps.add(new Employee(1901, "Trumph", 57));
		emps.add(new Employee(1950, "Boris Johnson", 56));

		System.out.println("Before sorting custom list of employees : ");
		Iterator<Employee> it = emps.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		Collections.sort(emps);

		System.out.println("After sorting custom list of employees in natural order: ");
		it = emps.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		Collections.sort(emps, Collections.reverseOrder());

		System.out.println("After sorting custom list of employees in decendng order: ");
		it = emps.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
