package com.java.w3schools.blog.ipaddress;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * NetworkInterface Example program to get IP Addresss and HostName.
 * 
 * @author Venkatesh
 *
 */
public class GetIPAddressNetworkInterface {

	public static void main(String[] args) throws SocketException {

		Enumeration e = NetworkInterface.getNetworkInterfaces();
		while (e.hasMoreElements()) {
			NetworkInterface n = (NetworkInterface) e.nextElement();
			Enumeration ee = n.getInetAddresses();
			while (ee.hasMoreElements()) {
				InetAddress i = (InetAddress) ee.nextElement();
				System.out.println("HostName : " + i.getHostName() + ", IP Address : " + i.getHostAddress());
			}
		}

	}

}