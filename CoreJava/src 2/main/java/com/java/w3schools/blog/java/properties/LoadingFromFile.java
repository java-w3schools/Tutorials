package com.java.w3schools.blog.java.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadingFromFile {

	public static void main(String[] args) {

		Properties properties = new Properties();

		System.out.println("Writing the properties into a file");
		try (InputStream input = new FileInputStream("files/payment.properties")) {
			properties.load(input);
			System.out.println("payment.properties loaded");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();

		String welcomeMsg = properties.getProperty("welcome.message");
		System.out.println("welcome.message value : " + welcomeMsg);

		String netBanking = properties.getProperty("payment.netbanking");
		System.out.println("payment.netbanking value : " + netBanking);

		String paypal = properties.getProperty("payment.paypal");
		System.out.println("payment.paypal value : " + paypal);

	}

}
