package com.java.w3schools.blog.HttpClient;

import java.io.IOException;

import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class HttpClientGetStatusCode {

	private static final String GOOGLE_URL = "http://www.google.com";

	private static CloseableHttpClient instance;

	private static CloseableHttpResponse response;

	public static void main(String[] args) throws ClientProtocolException, IOException {
		HttpGet httpGet = new HttpGet(GOOGLE_URL);
		instance = HttpClientBuilder.create().build();

		response = instance.execute(httpGet);

		System.out.println("response.getStatusLine() :: " + response.getStatusLine());
		final int statusCode = response.getStatusLine().getStatusCode();

		int code = HttpStatus.SC_OK;

		if (code == statusCode) {

			System.out.println("Status Code  : " + code);
		} else {
			System.out.println("StatusCode not 200  : " + code);
		}

	}

}
