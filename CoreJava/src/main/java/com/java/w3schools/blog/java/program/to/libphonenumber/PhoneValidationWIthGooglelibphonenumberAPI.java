package com.java.w3schools.blog.java.program.to.libphonenumber;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

public class PhoneValidationWIthGooglelibphonenumberAPI {

	public static void main(String[] args) throws NumberParseException {

		System.out.println("USA phone number validations: ");
		String[] usPhoneNumbers = { "(541) 754-3010", "+1-541-754-3010", "1-541-754-3010", "001-541-754-3010",
				"191 541 754 3010" };
		validatePhoneNumber(usPhoneNumbers, "US");

		System.out.println("\nindia phone number validations: ");
		String[] indiaPhoneNumbers = { "+91 7503907302", "9702522865", "+91–8477812345", "+91 9999999999",
				"+91 9688 123 456", "+9688 123 456" };
		validatePhoneNumber(indiaPhoneNumbers, "IN");

	}

	private static void validatePhoneNumber(String[] phoneNumbers, String region) throws NumberParseException {

		PhoneNumberUtil numberUtil = PhoneNumberUtil.getInstance();

		for (String number : phoneNumbers) {

			PhoneNumber phoneNumber = numberUtil.parse(number, region);

			boolean isValid = numberUtil.isValidNumber(phoneNumber);

			if (isValid) {
				System.out.println(number + " is a valid number.");
			} else {
				System.out.println(number + " is a not valid number.");
			}

		}

	}
}

/**

Output:

USA phone number validations: 
(541) 754-3010 is a valid number.
+1-541-754-3010 is a valid number.
1-541-754-3010 is a valid number.
001-541-754-3010 is a not valid number.
191 541 754 3010 is a not valid number.

india phone number validations: 
+91 7503907302 is a valid number.
9702522865 is a valid number.
+91–8477812345 is a valid number.
+91 9999999999 is a valid number.
+91 9688 123 456 is a valid number.
+9688 123 456 is a not valid number.

*/