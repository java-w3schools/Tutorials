package com.java.w3schools.string;

public class StringLengthExample {
	public static void main(String[] args) {

		String pincode1 = "500001";

		if (pincode1.length() == 6) {
			System.out.println("given pincode " + pincode1 + " is valid");
		} else {
			System.out.println("given pincode " + pincode1 + " is not valid");
		}

		String pincode2 = "50000";

		if (pincode2.length() == 6) {
			System.out.println("given pincode " + pincode2 + " is valid");
		} else {
			System.out.println("given pincode " + pincode2 + " is not valid");
		}

	}
}
