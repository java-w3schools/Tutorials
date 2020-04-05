package com.java.w3schools.blog.list;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayExamples {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Raghu");
		names.add("Raja");
		names.add("Ramu");
		names.add("Paul");
		names.add("Penum");

		// converting list of string into string[] array.

		// String[] strArray = (String[]) names.toArray();
		// System.out.println(strArray);

		String[] stringArrayFromList = names.toArray(new String[names.size()]);
		System.out.println("Printing the converted array values : ");

		for (String value : stringArrayFromList) {
			System.out.println(value);
		}
		
		String[] stringArray = names.toArray(new String[0]);
		System.out.println("with string array size 0 : ");

		for (String value : stringArray) {
			System.out.println(value);
		}
	}

}
