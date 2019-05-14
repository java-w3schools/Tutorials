package com.java.w3schools.classloader;

import java.net.URL;

public class GetResource {

	public static void main(String[] args) {

		System.out.println("--- " + GetResource.class.getClassLoader().getResource("").getPath());
		;

	}

}
