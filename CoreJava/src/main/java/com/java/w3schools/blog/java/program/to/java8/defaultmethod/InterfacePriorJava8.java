package com.java.w3schools.blog.java.program.to.java8.defaultmethod;

public interface InterfacePriorJava8 {

	int method1();

	int method2();

	default int method3() {
		System.out.println("method3 is a default method.");

		return 1;
	}
}
