package com.java.w3schools.blog.string;

public class StringSplitDot {

	public static void main(String[] args) {

		/*
		 * String fileNameWithExtn = "java-guide.pdf";
		 * 
		 * String[] values = fileNameWithExtn.split("."); String fileName = values[0];
		 * String extn = values[1];
		 * 
		 * System.out.println("file name : " + fileName);
		 * System.out.println("file extention : " + extn);
		 */

		String applicationFileName = "application.properties";

		String[] splits = applicationFileName.split("\\.");
		String fileName = splits[0];
		String fileType = splits[1];

		System.out.println("file name : " + fileName);
		System.out.println("file extention : " + fileType);

		String introFileName = "welcome.jsp";

		String[] nameSplits = introFileName.split("[.]s");

		System.out.println("file name : " + nameSplits[0]);
		System.out.println("file extention : " + nameSplits[1]);

	}

}
