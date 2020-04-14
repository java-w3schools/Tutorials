package com.java.w3schools.blog.HttpClient;

import java.io.IOException;

import org.apache.http.HttpHeaders;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClients;

public class HttpHeaderSetHeaderExample {

	private static String URI = "http://www.google.com";

	public static void main(String[] args) throws ClientProtocolException, IOException {
		HttpClient client = HttpClients.custom().build();
		HttpUriRequest request = RequestBuilder.get().setUri(URI)
				.setHeader(HttpHeaders.CONTENT_TYPE, "application/json").build();
		client.execute(request);

		System.out.println("Getting the header info from request");
		System.out.println("request header propery name : " + request.getAllHeaders()[0].getName());
		System.out.println("request header propery value : " + request.getAllHeaders()[0].getValue());

	}

}
