package com.java.w3schools.blog.string;

/**
 * Java - String to Int Conversion Examples
 * 
 * @author Venkateshn
 *
 */
public class StringToIntparseIntExample {

	public static void main(String[] args) {

		// Way 1
		String string = "12345";
		int intValue = Integer.parseInt(string);
		System.out.println("converted int Value : " + intValue);

		// Way 2
		String str = "789";
		int value = Integer.valueOf(str);
		System.out.println("converted string value to int using Integer valueOf method : " + value);

		// NumberFormatException
		String invalid = "java8example";
		// int invalidInt = Integer.parseInt(invalid);

		// Handling NumberFormatException
		int number;
		String strValue = "java8example";
		try {

			number = Integer.parseInt(strValue);
		} catch (NumberFormatException e) {
			number = -1;
		}

		if (number != -1) {
			System.out.println("String is parsed to a Number");
		} else {
			System.out.println("Invalid input " + strValue + " is given");
		}

	}

}

/**
 * Output:
 * 
 * converted int Value : 12345
converted string value to int using Integer valueOf method : 789
Invalid input java8example is given

 */