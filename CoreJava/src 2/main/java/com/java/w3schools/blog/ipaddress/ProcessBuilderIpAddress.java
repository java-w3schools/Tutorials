package com.java.w3schools.blog.ipaddress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

/**
 * ProcessBuilder example to get the hostname.
 * 
 * @author Venkatesh
 *
 */
public class ProcessBuilderIpAddress {

	public static void main(String[] args) throws IOException {
		ProcessBuilder processBuilder = new ProcessBuilder();
		processBuilder.command("hostname");
		Process process = processBuilder.start();
		
		
		InputStream inputStream = process.getInputStream();
		String hostName = null;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
			hostName = br.lines().collect(Collectors.joining(System.lineSeparator())).toString();
		}
		System.out.println(hostName);
		
		String [] commands = {"ping", "goofle.com"};
		processBuilder.command(commands);
		process = processBuilder.start();
		
		inputStream = process.getInputStream();
		String pingResult = null;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
			pingResult = br.lines().collect(Collectors.joining(System.lineSeparator())).toString();
		}
		System.out.println(pingResult);
	

	}

}

/*Output:
	
	java-w3schools-host-name

	Pinging goofle.com [192.185.39.34] with 32 bytes of data:
	Reply from 192.185.39.34: bytes=32 time=284ms TTL=41
	Reply from 192.185.39.34: bytes=32 time=446ms TTL=41
	Reply from 192.185.39.34: bytes=32 time=321ms TTL=41
	Reply from 192.185.39.34: bytes=32 time=264ms TTL=41

	Ping statistics for 192.185.39.34:
	    Packets: Sent = 4, Received = 4, Lost = 0 (0% loss),
	Approximate round trip times in milli-seconds:
	    Minimum = 264ms, Maximum = 446ms, Average = 328ms
*/
	    