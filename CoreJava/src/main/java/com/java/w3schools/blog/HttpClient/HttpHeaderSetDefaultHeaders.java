package com.java.w3schools.blog.HttpClient;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class HttpHeaderSetDefaultHeaders {

	private static String URI = "http://www.google.com";

	public static void main(String[] args) throws ClientProtocolException, IOException {
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(URI);
		request.setHeader(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate, br");
		request.setHeader(HttpHeaders.ACCEPT_LANGUAGE, "en-US,en;q=0.5");
		request.setHeader(HttpHeaders.ACCEPT, "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
		request.setHeader(HttpHeaders.CONNECTION, "keep-alive");
		request.setHeader(HttpHeaders.CACHE_CONTROL, "max-age=0");
		request.setHeader(HttpHeaders.USER_AGENT,
				"Mozilla/5.0 (Macintosh; Intel Mac OS X 10.9; rv:50.0) Gecko/20100101 Firefox/50.0");
		request.setHeader(HttpHeaders.HOST, "http://www.google.com");

		client.execute(request);

		System.out.println("Getting the header info from request before HttpClient 4.3 version.");

		Header[] headers = request.getAllHeaders();

		for (Header header : headers) {
			System.out.println("request header propery : " + header.getName() + " Value : " + header.getValue());

		}

	}

}
