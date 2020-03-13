package com.java.w3schools.blog.java.program.to.jackson;

import org.codehaus.jackson.map.ObjectMapper;

public class JSONToObjectJava {

	public static void main(String[] args) {

		String jsonString = "{					\"name\": \"nadal\", 					\"age\": \"35\",				\"gender\": \"M\"		}";

		ObjectMapper objectWriter = new ObjectMapper();
		
		Customer customer = objectWriter.readValue(jsonString, Customer.class);
		
		
	}

}
