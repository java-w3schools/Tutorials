package com.java.w3schools.blog.string;

/**
 * Java String offsetByCodePoints() method example
 * @author Venkatesh
 *
 */
public class StringOffsetByCodePoints {
	public static void main(String[] args) {

		// Example 1
		String blogName = "java-w3schools blog is a Googles blog";
		int offsetIndex = blogName.offsetByCodePoints(3, 5);
		System.out.println("Input String : "+blogName);
		System.out.println("offset index : " + offsetIndex);
		
		// Example 2
		int offsetIndex2 = blogName.offsetByCodePoints(30, 100);
	}
}

/*Output:
	Input String : java-w3schools blog is a Googles blog
	offset index : 8
	Exception in thread "main" java.lang.IndexOutOfBoundsException
		at java.base/java.lang.Character.offsetByCodePoints(Character.java:8929)
		at java.base/java.lang.String.offsetByCodePoints(String.java:829)
		at com.java.w3schools.blog.string.StringOffsetByCodePoints.main(StringOffsetByCodePoints.java:18)
*/