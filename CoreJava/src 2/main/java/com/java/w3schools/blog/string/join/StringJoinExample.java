package com.java.w3schools.blog.string.join;

import java.util.ArrayList;
import java.util.List;

public class StringJoinExample {
	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		fruits.add("Orange");
		fruits.add("Papaya");
		fruits.add("Banana");
		fruits.add("Kiwi");
		fruits.add("Apple");

		String joinString = String.join("***", fruits);

		System.out.println("List example joinString : " + joinString);
	}
}
