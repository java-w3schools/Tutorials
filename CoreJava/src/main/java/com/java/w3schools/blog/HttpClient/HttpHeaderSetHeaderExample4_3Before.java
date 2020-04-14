package com.java.w3schools.blog.HttpClient;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpParams;

public class HttpHeaderSetHeaderExample4_3Before {

	private static String URI = "http://www.google.com";

	public static void main(String[] args) throws ClientProtocolException, IOException {

		Header header1 = new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json");
		Header header2 = new BasicHeader(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate, br");
		Header header3 = new BasicHeader(HttpHeaders.ACCEPT_LANGUAGE, "en-US,en;q=0.5");
		Header header4 = new BasicHeader(HttpHeaders.ACCEPT,
				"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
		Header header5 = new BasicHeader(HttpHeaders.CONNECTION, "keep-alive");
		Header header6 = new BasicHeader(HttpHeaders.CACHE_CONTROL, "max-age=0");
		Header header7 = new BasicHeader(HttpHeaders.USER_AGENT,
				"Mozilla/5.0 (Macintosh; Intel Mac OS X 10.9; rv:50.0) Gecko/20100101 Firefox/50.0");
		Header header8 = new BasicHeader(HttpHeaders.HOST, "http://www.google.com");

		List<Header> headers = Arrays.asList(header1, header2, header3, header4, header5, header6, header7, header8);
		HttpClient client = HttpClients.custom().setDefaultHeaders(headers).build();
		HttpUriRequest request = RequestBuilder.get().setUri(URI).build();
		client.execute(request);


		HttpParams allHeaders = client.getParams();
		System.out.println(allHeaders.getParameter(HttpHeaders.CONTENT_TYPE));

	}

}
