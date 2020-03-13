package com.java.w3schools.blog.java.program.to.system.env;

/**
 * 
 * java Program to read system environment variables in Java
 * 
 * @author JavaProgramTo.com
 *
 */
public class ReadEnvVar {

	public static void main(String[] args) {

		String shellValue = System.getenv("SHELL");
		System.out.println("SHELL value : " + shellValue);

		String tempDir = System.getenv("TMPDIR");
		System.out.println("TMPDIR value : " + tempDir);

		String pathValue = System.getenv("PATH");
		System.out.println("PATH value : " + pathValue);

		String JavaHomeValue = System.getenv("JAVA_HOME");
		System.out.println("Java_home value : " + JavaHomeValue);

	}

}
