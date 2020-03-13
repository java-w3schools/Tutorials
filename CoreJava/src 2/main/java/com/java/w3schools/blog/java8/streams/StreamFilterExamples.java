package com.java.w3schools.blog.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 
 * Java 8 Streams filter() - Working Examples
 * 
 * @author Venkatesh
 *
 */
public class StreamFilterExamples {

	public static void main(String[] args) {

		// Predicate examples.
		Predicate<String> namePredicate = s -> s.startsWith("JH");
		Predicate<Integer> evenPredicate = i -> i % 2 == 0;

		List<Car> carsList = getCarsList();
		Set<String> modelnamesList = carsList.stream().filter(car -> car.getFuelType().equals("D"))
				.map(Car::getModelName).collect(Collectors.toSet());
		modelnamesList.forEach(System.out::println);

		Optional<String> firstDieselCar = carsList.stream()
				.filter(car -> car.getBrandName().equals("Suziki") && car.getFuelType().equals("D"))
				.map(car -> car.getModelName()).findFirst();

		System.out.println("First Suziki diesel car name : " + firstDieselCar.get());
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

class Car {
	private String brandName;
	private String modelName;
	private int manfactureYear;
	private String fuelType;

	public Car(String brandName, String modelName, int manfactureYear, String fuelType) {
		this.brandName = brandName;
		this.modelName = modelName;
		this.manfactureYear = manfactureYear;
		this.fuelType = fuelType;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getManfactureYear() {
		return manfactureYear;
	}

	public void setManfactureYear(int manfactureYear) {
		this.manfactureYear = manfactureYear;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Car [brandName=" + brandName + ", modelName=" + modelName + ", manfactureYear=" + manfactureYear
				+ ", fuelType=" + fuelType + "]";
	}

}
