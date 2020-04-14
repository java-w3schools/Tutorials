package com.java.w3schools.blog.java8.stream;

public class Employee {

	private int id;
	private String fullName;
	private int age;
	private String desgnation;
	private String company;

	public Employee() {

	}

	public Employee(int id, String fullName, String desgnation, String company) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.desgnation = desgnation;
		this.company = company;
	}

	public Employee(int id, String fullName, int age, String desgnation) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.age = age;
		this.desgnation = desgnation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesgnation() {
		return desgnation;
	}

	public void setDesgnation(String desgnation) {
		this.desgnation = desgnation;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullName=" + fullName + ", age=" + age + ", desgnation=" + desgnation
				+ ", company=" + company + "]";
	}

}
