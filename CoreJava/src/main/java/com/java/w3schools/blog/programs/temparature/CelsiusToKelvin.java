package com.java.w3schools.blog.programs.temparature;

/**
 * Java Example to convert Degree Celsius to Kelvin
 * 
 * @author Venkatesh
 *
 */
public class CelsiusToKelvin {

	public static void main(String[] args) {

		float celsiusValue = 100;
		float kelvinValue = convertCelsiusToKelvin(celsiusValue);
		System.out.println("Kelvin value " + kelvinValue + " for Degree Celsius " + celsiusValue);

		celsiusValue = 110;
		kelvinValue = convertCelsiusToKelvin(celsiusValue);
		System.out.println("Kelvin value " + kelvinValue + " for Degree Celsius " + celsiusValue);

		celsiusValue = 120;
		kelvinValue = convertCelsiusToKelvin(celsiusValue);
		System.out.println("Kelvin value " + kelvinValue + " for Degree Celsius " + celsiusValue);

	}

	private static float convertCelsiusToKelvin(float celcius) {

		return (float) (celcius + 273.15);
	}

}

/**
Output:

Kelvin value 373.15 for Degree Celsius 100.0
Kelvin value 383.15 for Degree Celsius 110.0
Kelvin value 393.15 for Degree Celsius 120.0

*/