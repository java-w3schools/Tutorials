package com.java.w3schools.blog.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.java.w3schools.blog.model.Employee;

/**
 * 
 * Compare two arraylist contents and store unmatched contents in another arraylist.
 * Two lists are having Employee Objects.
 * 
 * Link: https://java-w3schools.blogspot.com
 * 
 */
public class UnmatchedEmployeObjectsList {

	public static void main(String[] args) {

		List<Employee> list1 = new ArrayList<>();
		list1.add(new Employee(100, "Jhon"));
		list1.add(new Employee(200, "Cena"));
		list1.add(new Employee(300, "Rock"));
		list1.add(new Employee(400, "Undertaker"));

		List<Employee> list2 = new ArrayList<>();
		list2.add(new Employee(100, "Jhon"));
		list2.add(new Employee(300, "Rock"));

		list1.removeAll(list2);

		System.out.println(list1);
	}

}

/*Output:
	[Employee [id=200, name=Cena], Employee [id=400, name=Undertaker]]
*/