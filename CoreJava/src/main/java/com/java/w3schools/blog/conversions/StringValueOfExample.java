package com.java.w3schools.blog.conversions;

/**
 * 
 * Example program to convert Float to String with String.valueOf(float f)
 * 
 * @author javaprogramto.com
 *
 */
public class StringValueOfExample {

	public static void main(String[] args) {

		// primitive float to string
		float primitiveFloat = 900;
		String primitiveFloatStr = String.valueOf(primitiveFloat);
		System.out.println("primitiveFloatStr :" + primitiveFloatStr);

		float pi = 3.14000f;
		String piStringValue = String.valueOf(pi);
		System.out.println("piStringValue : " + piStringValue);

		// Wrapper Float to string
		Float floatWrapper = new Float(999.999);
		String floatWrapperStr = String.valueOf(floatWrapper);
		System.out.println("floatWrapperStr : " + floatWrapperStr);

		Float floatWrappeDecimals = new Float(2343.343);
		String floatWrappeDecimalsStr = String.valueOf(floatWrappeDecimals);
		System.out.println("floatWrappeDecimals : " + floatWrappeDecimalsStr);
	}
}
