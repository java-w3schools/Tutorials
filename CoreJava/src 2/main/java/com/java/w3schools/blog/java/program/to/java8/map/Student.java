package com.java.w3schools.blog.java.program.to.java8.map;

public class Student {

	private int Id;
	private String name;
	private char grade;

	public Student(int id, String name, char grade) {
		super();
		Id = id;
		this.name = name;
		this.grade = grade;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

}
