package com.java.w3schools.blog.java.program.to.libphonenumber;

public class PhoneValidationRegularExpression {

	public static void main(String[] args) {

		System.out.println("Validation for 1234567890 : " + validatePhoneNumber("1234567890"));
		System.out.println("Validation for 1234 567 890 : " + validatePhoneNumber("1234 567 890"));	
		System.out.println("Validation for 123 456 7890 : " + validatePhoneNumber("123 456 7890"));
		System.out.println("Validation for 123-567-8905 : " + validatePhoneNumber("123-567-8905"));
		System.out.println("Validation for 9866767545 : " + validatePhoneNumber("9866767545"));
		System.out.println("Validation for 123-456-7890 ext9876 : " + validatePhoneNumber("123-456-7890 ext9876"));

	}

	private static boolean validatePhoneNumber(String phoneNumber) {
		// validate phone numbers of format "1234567890"
		if (phoneNumber.matches("\\d{10}"))
			return true;
		// validating phone number with -, . or spaces
		else if (phoneNumber.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))
			return true;
		// validating phone number with extension length from 3 to 5
		else if (phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}"))
			return true;
		// validating phone number where area code is in braces ()
		else if (phoneNumber.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}"))
			return true;
		// Validation for India numbers
		else if (phoneNumber.matches("\\d{4}[-\\.\\s]\\d{3}[-\\.\\s]\\d{3}"))
			return true;
		else if (phoneNumber.matches("\\(\\d{5}\\)-\\d{3}-\\d{3}"))
			return true;

		else if (phoneNumber.matches("\\(\\d{4}\\)-\\d{3}-\\d{3}"))
			return true;
		// return false if nothing matches the input
		else
			return false;

	}
}

/**

Output:

Validation for 1234567890 : true
Validation for 1234 567 890 : true
Validation for 123 456 7890 : true
Validation for 123-567-8905 : true
Validation for 9866767545 : true
Validation for 123-456-7890 ext9876 : true

*/