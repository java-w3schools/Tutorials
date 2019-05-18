package com.java.w3schools.blog.string;

import java.util.ArrayList;
import java.util.List;

public class StringListEqualsIgnoreCaseExample {
	public static void main(String[] args) {

		List<String> technologies = new ArrayList<>();
		technologies.add("java");
		technologies.add("hadoop");
		technologies.add("html");
		technologies.add("css");

		for (String technology : technologies) {
			if ("JAVA".equalsIgnoreCase(technology)) {
				System.out.println("Java technology is the best programming language");
			}
		}
	}
}