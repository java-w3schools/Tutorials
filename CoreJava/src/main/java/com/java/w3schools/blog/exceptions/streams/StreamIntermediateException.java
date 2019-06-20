package com.java.w3schools.blog.exceptions.streams;

import java.util.stream.Stream;

/**
 * Example 2 to throw java.lang.IllegalStateException: stream has already been
 * operated upon or closed
 * 
 * @author Java-W3schools
 *
 */
public class StreamIntermediateException {
	public static void main(String[] args) {
		// Creating Stream from String.
		String conent = "line 1 \n line 2 \\n line 3 \\n line 4 \\n line 5";
		Stream<String> mainStream = Stream.of(conent.split("\n"));

		mainStream.filter(line -> line.indexOf("line") > -1);
		mainStream.filter(line -> line.indexOf("1") > -1);

	}
}
