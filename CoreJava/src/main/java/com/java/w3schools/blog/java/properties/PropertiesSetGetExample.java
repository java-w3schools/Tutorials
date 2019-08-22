package com.java.w3schools.blog.java.properties;

import java.util.Properties;

public class PropertiesSetGetExample {

	public static void main(String[] args) {

		Properties properties = new Properties();
		properties.setProperty("IN", "India");
		properties.setProperty("USA", "United States");
		properties.setProperty("AUS", "Australia");

		System.out.println("All properties : " + properties);

		System.out.println("Retrieving the properties by key ");

		String AUSValue = properties.getProperty("AUS");
		System.out.println("Value for AUS key is " + AUSValue);

		String INValue1 = properties.getProperty("IN");
		System.out.println("Value for IN key is " + INValue1);

		String USAValue1 = properties.getProperty("USA");
		System.out.println("Value for USA key is " + USAValue1);
	}

}
