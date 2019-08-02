package com.java.w3schools.blog.java8.statistics;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Java 8 DoubleSummaryStatistics API - Working Examples
 * 
 * @author venkatesh
 *
 */
public class DoubleSummaryStatisticsExample {

	public static void main(String[] args) {
		Employee[] employees = new Employee[] { new Employee(100, "Paul", 10000, 20, 365),
				new Employee(200, "Amul", 20000, 30, 600), new Employee(300, "Aliy", 30000, 45, 1000) };

		List<Employee> empList = Arrays.asList(employees);
		DoubleSummaryStatistics salaryStatistics = empList.stream()
				.collect(Collectors.summarizingDouble(Employee::getSal));
		System.out.println("Empoyee salary statistics : " + salaryStatistics);

		DoubleSummaryStatistics noOfdaysInStatistics = empList.stream()
				.collect(Collectors.summarizingDouble(Employee::getNoOfDaysIn));
		System.out.println("Empoyee no. of days statistics : " + noOfdaysInStatistics);

		DoubleSummaryStatistics doubleSummaryStatistics = new DoubleSummaryStatistics(100, 100000, 500000, 100000000);
		System.out.println("doubleSummaryStatistics count : " + doubleSummaryStatistics.getCount());
		System.out.println("doubleSummaryStatistics average : " + doubleSummaryStatistics.getAverage());
		System.out.println("doubleSummaryStatistics max : " + doubleSummaryStatistics.getMax());
		System.out.println("doubleSummaryStatistics min : " + doubleSummaryStatistics.getMin());
		System.out.println("doubleSummaryStatistics sum : " + doubleSummaryStatistics.getSum());

	}

}

class Employee {
	private int id;
	private String name;
	private double sal;
	private int age;
	private double noOfDaysIn;

	public Employee(int id, String name, double sal, int age, double noOfDaysIn) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.age = age;
		this.noOfDaysIn = noOfDaysIn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getNoOfDaysIn() {
		return noOfDaysIn;
	}

	public void setNoOfDaysIn(double noOfDaysIn) {
		this.noOfDaysIn = noOfDaysIn;
	}

}

/*Output:
Empoyee salary statistics : DoubleSummaryStatistics{count=3, sum=60000.000000, min=10000.000000, average=20000.000000, max=30000.000000}
Empoyee no. of days statistics : DoubleSummaryStatistics{count=3, sum=1965.000000, min=365.000000, average=655.000000, max=1000.000000}
doubleSummaryStatistics count : 100
doubleSummaryStatistics average : 1000000.0
doubleSummaryStatistics max : 500000.0
doubleSummaryStatistics min : 100000.0
doubleSummaryStatistics sum : 1.0E8
*/
