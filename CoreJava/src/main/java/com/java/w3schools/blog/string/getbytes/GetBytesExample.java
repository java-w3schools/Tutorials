package com.java.w3scools.blog.string.getbytes;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class GetBytesExample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String string = "w3schools";

		byte[] bytes = string.getBytes();

		for (byte b : bytes) {
			System.out.print(b);
		}

		bytes = string.getBytes("UTF-16BE"); // 0119051011509901040111011101080115
		bytes = string.getBytes("UTF-16LE"); // 1190510115099010401110111010801150
		System.out.println();
		for (byte b : bytes) {
			System.out.print(b);
		}

		bytes = string.getBytes(Charset.defaultCharset()); // 11905101150990104011101110108011501195111599104111111108115

		for (byte b : bytes) {
			System.out.print(b);
		}
	}

}
