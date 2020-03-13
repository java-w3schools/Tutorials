package com.java.w3schools.blog.string;

public class EndswithDomainChecker {
	public static void main(String[] args) {
		String domain1 = "https://en.wikipedia.org";
		String domain2 = "java-w3schools.blogspot.com";
		String domain3 = "oracle.java";

		System.out.println("Checking Domain 1 : "+checkDomain(domain1));
		System.out.println("Checking Domain 2 : "+checkDomain(domain2));
		System.out.println("Checking Domain 3 : "+checkDomain(domain3));

	}

	private static String checkDomain(String domainName) {

		if (domainName.endsWith(".com")) {
			return "Valid domain " + domainName;
		} else if (domainName.endsWith(".org")) {
			return "Valid domain " + domainName;
		} else if (domainName.endsWith(".net")) {
			return "Valid domain " + domainName;
		}

		return "Invalid domain " + domainName;
	}
}
