package com.java.w3schools.blog.java.program.to.strings;

public class StringsCompareEqualsMethod {

	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "java";

		String s3 = new String("java");
		String s4 = new String("java");

		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("s1.equals(s3) : " + s1.equals(s3));
		System.out.println("s2.equals(s3) : " + s2.equals(s3));
		System.out.println("s3.equals(s4) : " + s3.equals(s4));

		String s5 = "javaprogramto.com";
		String s6 = "java" + "programto.com";

		System.out.println("s5.equals(s6) : " + s5.equals(s6));

		String s7 = s2 + "programto.com";

		System.out.println("s5.equals(s7) : " + s5.equals(s7));

		String s8 = new String(s7);
		System.out.println("s7.equals(s8) : " + s7.equals(s8));

		String s9 = s1;
		System.out.println("s9.equals(s1) : " + s9.equals(s1));

		String s10 = s8;
		System.out.println("s10.equals(s8) : " + s10.equals(s8));

		String s11 = "Java";
		System.out.println("s1.equals(s11) : " + s1.equals(s11));

		String s12 = new String("javaprogramto.com");
		System.out.println("s5.equals(s12) : " + s5.equals(s12));

		String s13 = new String("JavaProgramTo.com");
		System.out.println("s13.equals(s12) : " + s13.equals(s12));
	}

}
