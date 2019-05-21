package com.java.w3schools.blog.ipaddress;

import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * Getting IP Address and Host name for remote and local server.
 * 
 * @author Venkatesh
 *
 */
public class GetIPAddressInetAddress {

	public static void main(String[] args) throws SocketException, UnknownHostException {
		
		InetAddress localAddress = InetAddress.getLocalHost();
		String localHostName = localAddress.getHostName();
		String localHostAddress = localAddress.getHostAddress();
		
		System.out.println("localHostName : "+localHostName);
		System.out.println("localHostAddress : "+localHostAddress);

		InetAddress remoteAddress = InetAddress.getByName("google.com");
		
		String remoteHostName = remoteAddress.getHostName();
		String remoteHostAddress = remoteAddress.getHostAddress();

		System.out.println("remoteHostName : "+remoteHostName);
		System.out.println("remoteHostAddress : "+remoteHostAddress);
		
	}

}

/*Output:
	localHostName : java-w3schools
	localHostAddress : 168.0.1.2
	remoteHostName : google.com
	remoteHostAddress : 172.217.163.142
	*/
