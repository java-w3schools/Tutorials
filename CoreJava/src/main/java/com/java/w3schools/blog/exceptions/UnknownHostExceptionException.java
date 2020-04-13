package com.java.w3schools.blog.exceptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class UnknownHostExceptionException {

	public static void main(String[] args) throws IOException {

		String hostname = "http://javaprogram.comm";
		URL url = null;
		try {
			url = new URL(hostname);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.getResponseCode();

	}

}
