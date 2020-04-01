package com.java.w3schools.blog.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 
 * Converting List of Strings into Map<String, Integer>
 * 
 * @author JavaProgramTo.com
 *
 */
public class StringListToMap {

	public static void main(String[] args) {

		// List of Strings into Map
		List<String> stringsList = new ArrayList<String>();

		stringsList.add("java 8");
		stringsList.add("convert");
		stringsList.add("List of Strings");
		stringsList.add("Map");

		// list to map
		Map<String, Integer> map = stringsList.stream().collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println("Convertee map : " + map);

	}

}
