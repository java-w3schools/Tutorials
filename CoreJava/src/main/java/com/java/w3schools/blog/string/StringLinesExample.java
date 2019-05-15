package com.java.w3schools;

import java.util.stream.Stream;

public class StringLinesExample {

	public static void main(String[] args) {

		String content = "hello\njava\nworld";
		Stream<String> lines = content.lines();
		lines.forEach(line -> System.out.println("line : " + line));

		//System.out.println("Returned Stream size: " + lines.toArray().length);
	}
}
