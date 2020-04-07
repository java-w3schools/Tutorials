package com.java.w3schools.blog.java.program.to.strings;

public class StringsCompareDoubleEqualOperator {

	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "java";

		String s3 = new String("java");
		String s4 = new String("java");

		System.out.println("(s1 == s2) : " + (s1 == s2));
		System.out.println("(s1 == s3) : " + (s1 == s3));
		System.out.println("(s2 == s3) : " + (s2 == s3));
		System.out.println("(s3 == s4) : " + (s3 == s4));

		String s5 = "javaprogramto.com";
		String s6 = "java" + "programto.com";

		System.out.println("(s5 == s6) : " + (s5 == s6));

		String s7 = s2 + "programto.com";

		System.out.println("(s5 == s7) : " + (s5 == s7));

		String s8 = new String(s7);
		System.out.println("(s7 == s8) : " + (s7 == s8));

		String s9 = s1;
		System.out.println("(s9 == s1) : " + (s9 == s1));

		String s10 = s8;
		System.out.println("(s10 == s8) : " + (s10 == s8));
	}

}
