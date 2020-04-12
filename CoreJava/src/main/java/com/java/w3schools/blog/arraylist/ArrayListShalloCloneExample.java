package com.java.w3schools.blog.arraylist;

import java.util.ArrayList;

/**
 * 
 * Java ArrayList Clone Example with custom object
 * 
 * @author Java8Example blog
 *
 */
public class ArrayListShalloCloneExample {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(100, "harish"));
		list.add(new Student(101, "Jayaram"));

		ArrayList<Student> clonedList = (ArrayList) list.clone();

		Student student = clonedList.get(1);
		student.setName("Jhon");

		System.out.println("Cloned list : " + clonedList);
		System.out.println("Original list : " + list);

	}

}

class Student {

	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
