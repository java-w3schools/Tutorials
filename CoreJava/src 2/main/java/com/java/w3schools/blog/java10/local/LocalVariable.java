package com.java.w3schools.blog.java10.local;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LocalVariable {
	public static void main(String[] args) {

		var byeNote = "Saying Good Bye to Java 9 local variables";
		var var = 10;
		System.out.println(var);

		List<String> fruits = new ArrayList<>();
		Set<List<String>> fruitsSet = new HashSet<>();

		var data = new ArrayList<String>();
		data.add("local");
		data.add("type");

		for (var i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}

		// storing getStatus method returnted value into var variable.
		var value = getStatus();

		var n = 6;
		// n = "six";

		// var y = null;

		var studentList = new ArrayList<>();
		studentList.add(new Student(100));
		studentList.add("second");
		studentList.add(new Car());

		var obj = new Object() {
			String name = "java";
		};

		// obj = new Object();
	}

	static {
		var car = new Car();
	}

	public static String getStatus() {
		var str = "Success";
		return str;
	}

	/*
	 * public var printNumber(int num) { System.out.println(num); }
	 */
}

class Student {

	int id;

	public Student(int id) {
		this.id = id;
	}
}

class Car {

}
