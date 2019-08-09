package com.java.w3schools.blog.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Java 8 Streams filter() - Working Examples
 * 
 * @author Venkatesh
 *
 */
public class StreamFilterExamplesBeforeJava8 {

	public static void main(String[] args) {

		List<Car> carsList = getCarsList();
		List<Car> suzikiCarsList = new ArrayList<>();
		for (Car car : carsList) {
			if (car.getBrandName().equals("Suziki")) {
				suzikiCarsList.add(car);
			}
		}

		System.out.println("Suziki cars list : " + suzikiCarsList);
		System.out.println("-------------------In Java 8 ----------------------");
		inJava8();

	}

	private static void inJava8() {

		List<Car> carsList = getCarsList();
		List<Car> suzikiList = carsList.stream().filter(car -> car.getBrandName().equals("Suziki"))
				.collect(Collectors.toList());
		System.out.println("In Java 8, Suziki cars list : " + suzikiList);

		List<Car> cars2019List = carsList.stream().filter(car -> car.getManfactureYear() == 2019)
				.collect(Collectors.toList());
		System.out.println("Cars count manufacture in 2019 : " + cars2019List.size());
	}

	private static List<Car> getCarsList() {
		Car ciazCar = new Car("Suziki", "Ciaz", 2019, "D");
		Car dezireCar = new Car("Suziki", "Dezire", 2018, "P");
		Car swiftCar = new Car("Suziki", "Swift", 2012, "D");
		Car aspireCar = new Car("Ford", "Aspire", 2019, "D");
		Car figoCar = new Car("Ford", "Figo", 2015, "P");
		Car amazeCar = new Car("Honda", "Amaze", 2017, "D");
		Car vernaCar = new Car("Hyundai", "Verna", 2018, "P");

		List<Car> carsList = new ArrayList<>();
		carsList.add(ciazCar);
		carsList.add(dezireCar);
		carsList.add(swiftCar);
		carsList.add(aspireCar);
		carsList.add(figoCar);
		carsList.add(amazeCar);
		carsList.add(vernaCar);

		return carsList;
	}

}