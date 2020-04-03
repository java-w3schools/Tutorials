package com.java.w3schools.blog.conversions;

/**
 * 
 * Example program to convert Float to String with Float.toString() Method.
 * 
 * @author javaprogramto.com
 *
 */
public class FloatToStringExample {

	public static void main(String[] args) {

		// primitive float to string
		float primitiveFloat = 100f;
		String primitiveFloatStr = Float.toString(primitiveFloat);
		System.out.println("primitiveFloatStr :" + primitiveFloatStr);

		float pi = 3.14f;
		String piStringValue = Float.toString(pi);
		System.out.println("piStringValue : " + piStringValue);

		// Wrapper Float to string
		Float floatWrapper = new Float(1000.1000);
		String floatWrapperStr = Float.toString(floatWrapper);
		System.out.println("floatWrapperStr : " + floatWrapperStr);

		Float floatWrapperPI = new Float(3.14);
		String floatWrapperPIStr = Float.toString(floatWrapperPI);
		System.out.println("floatWrapperPIStr : " + floatWrapperPIStr);
	}

}
