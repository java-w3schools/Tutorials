package com.java.w3schools.blog.string;

/**
 * Java String API replaceAll() Method Example
 * 
 * @author Venkatesh
 *
 */
public class StringReplaceAllExample {

	public static void main(String[] args) {

		String str1 = "Welcome to Java 8. We are learning Java 8 String API now.";
		String replacedNewString = str1.replaceAll("Java 8", "Java 12");
		System.out.println("replaceAll method output: " + replacedNewString);
		
		String str2 = "Welcome to java w3schools blog";
		String replacedNewString2 = str2.replaceAll("\\s", "-");
		System.out.println("After removing white spaces : " + replacedNewString2);
		
		str2.replaceAll("[^*^", "Invalid");

	}
}

/*Output:
	replaceAll method output: Welcome to Java 12. We are learning Java 12 String API now.
	After removing white spaces : Welcome-to-java-w3schools-blog
	Exception in thread "main" java.util.regex.PatternSyntaxException: Unclosed character class near index 3
	[^*^
	   ^
		at java.base/java.util.regex.Pattern.error(Pattern.java:2015)
		at java.base/java.util.regex.Pattern.clazz(Pattern.java:2683)
		at java.base/java.util.regex.Pattern.sequence(Pattern.java:2126)
		at java.base/java.util.regex.Pattern.expr(Pattern.java:2056)
		at java.base/java.util.regex.Pattern.compile(Pattern.java:1778)
		at java.base/java.util.regex.Pattern.<init>(Pattern.java:1427)
		at java.base/java.util.regex.Pattern.compile(Pattern.java:1068)
		at java.base/java.lang.String.replaceAll(String.java:2135)
		at com.java.w3schools.blog.string.StringReplaceAllExample.main(StringReplaceAllExample.java:21)
*/