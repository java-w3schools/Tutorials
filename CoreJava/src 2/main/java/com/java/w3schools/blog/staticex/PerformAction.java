package com.java.w3schools.blog.staticex;

public class PerformAction {

	static int retryCounter = Incrementor.incrementByOne();
	
	public static int performCountInc() {
	
		return retryCounter;
	}
}
