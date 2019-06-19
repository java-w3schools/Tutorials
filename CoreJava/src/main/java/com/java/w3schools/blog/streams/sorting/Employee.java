package com.java.w3schools.blog.streams.sorting;

public class Employee {

	private int id;
	private Long salary;
	private String designation;

	public Employee(int id, Long salary, String designation) {
		this.id = id;
		this.salary = salary;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", designation=" + designation + "]";
	}
}
