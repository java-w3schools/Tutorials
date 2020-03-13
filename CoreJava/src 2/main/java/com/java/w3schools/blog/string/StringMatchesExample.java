package com.java.w3schools.blog.string;

/**
 * String API matches() method example
 * 
 * @author Venkatesh
 *
 */
public class StringMatchesExample {

	public static void main(String[] args) {

		// Example 1 to check word 'java'
		String str1 = "Welcome to java-w3schools";
		boolean isMatch = str1.matches("(.*)java(.*)");
		System.out.println("Does input str1 has 'java' word : "+isMatch);

		isMatch = str1.matches("(.*)world(.*)");
		System.out.println("Does input str1 has 'world' word : "+isMatch);
		
		// Example 2: Checking only alphabets -
		String str2 = "Google is very popular search engine";
		isMatch = str2.matches("[a-zA-Z ]+");
		System.out.println("Does input str2 has only alphabetics: "+isMatch);
		
		String str3 = "Google is very popular search engine and it is No 1";
		isMatch = str3.matches("[a-zA-Z ]+");
		System.out.println("Does input str3 has only alphabetics: "+isMatch);
		
		// Example 3: Checking only numerics
		String str4 = "16784311299";
		isMatch = str4.matches("[0-9]+");
		System.out.println("Does input str4 has only numerics: "+isMatch);
		
		// Example to see exception (java.util.regex.PatternSyntaxException)
		isMatch = str4.matches("[0-**9]+($$");
	}
}


/*Output:
	Does input str1 has 'java' word : true
	Does input str1 has 'world' word : false
	Does input str2 has only alphabetics: true
	Does input str3 has only alphabetics: false
	Does input str4 has only numerics: true
	Exception in thread "main" java.util.regex.PatternSyntaxException: Illegal character range near index 3
	[0-**9]+($$
	   ^
		at java.base/java.util.regex.Pattern.error(Pattern.java:2015)
		at java.base/java.util.regex.Pattern.range(Pattern.java:2813)
		at java.base/java.util.regex.Pattern.clazz(Pattern.java:2701)
		at java.base/java.util.regex.Pattern.sequence(Pattern.java:2126)
		at java.base/java.util.regex.Pattern.expr(Pattern.java:2056)
		at java.base/java.util.regex.Pattern.compile(Pattern.java:1778)
		at java.base/java.util.regex.Pattern.<init>(Pattern.java:1427)
		at java.base/java.util.regex.Pattern.compile(Pattern.java:1068)
		at java.base/java.util.regex.Pattern.matches(Pattern.java:1173)
		at java.base/java.lang.String.matches(String.java:2033)
		at com.java.w3schools.blog.string.StringMatchesExample.main(StringMatchesExample.java:36)
*/