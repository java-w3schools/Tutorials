package com.java.w3schools.blog.programs.temparature;

/**
 * Java Example to convert Kelvin To Degree Celsius
 * 
 * @author Venkatesh
 *
 */
public class KelvinToCelsius {

	public static void main(String[] args) {

		float celsiusValue = 500;
		float kelvinValue = convertKelvinToCelsius(celsiusValue);
		System.out.println("Degree Celsius value " + kelvinValue + " for Kelvin " + celsiusValue);

		celsiusValue = 400;
		kelvinValue = convertKelvinToCelsius(celsiusValue);
		System.out.println("Degree Celsius value " + kelvinValue + " for Kelvin " + celsiusValue);

		celsiusValue = 300;
		kelvinValue = convertKelvinToCelsius(celsiusValue);
		System.out.println("Degree Celsius value " + kelvinValue + " for Kelvin " + celsiusValue);

	}

	private static float convertKelvinToCelsius(float kelvin) {

		return (float) (kelvin - 273.15);
	}

}

/**

Output:

Degree Celsius value 226.85 for Kelvin 500.0
Degree Celsius value 126.85 for Kelvin 400.0
Degree Celsius value 26.85 for Kelvin 300.0

*/