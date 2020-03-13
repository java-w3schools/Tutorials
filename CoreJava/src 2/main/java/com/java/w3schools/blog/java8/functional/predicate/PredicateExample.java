package com.java.w3schools.blog.java8.functional.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * java 8 Predicate Example Programs
 * 
 * @author Venkatesh
 *
 */
public class PredicateExample {

	public static void main(String[] args) {

// Basic Predicate example
		Predicate<Student> agePredicate = s -> s.getAge() > 18;
		Student s1 = new Student(100, "Larry", 25);
		boolean is18Plus = agePredicate.test(s1);

		if (is18Plus) {
			System.out.println("Larray is 18 plus");
		}

// Creating List
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student(100, "Lary", 10));
		stuList.add(new Student(200, "page", 20));
		stuList.add(new Student(101, "sundar", 30));
		stuList.add(new Student(202, "pichai", 17));

		List<Student> list18Plus = null;
		list18Plus = stuList.stream().filter(stu -> stu.getAge() > 18).collect(Collectors.toList());
		System.out.println(list18Plus);

// add example
		Predicate<Student> namePredicate = s -> s.getName().startsWith("p");
		Predicate<Student> ageNamePredicate = agePredicate.and(namePredicate);

		Student page = new Student(200, "page", 20);

		boolean isMatched = ageNamePredicate.test(page);
		System.out.println(isMatched);

		List<Student> andResult = stuList.stream().filter(ageNamePredicate).collect(Collectors.toList());
		System.out.println(andResult);

// or example
		Predicate<Student> orPredicate = agePredicate.or(namePredicate);

		List<Student> orResult = stuList.stream().filter(orPredicate).collect(Collectors.toList());
		System.out.println(orResult);

// isEqual example
		Predicate<Student> isEqualPredicate = Predicate.isEqual(page);

		List<Student> isEqualResult = stuList.stream().filter(isEqualPredicate).collect(Collectors.toList());
		System.out.println(isEqualResult);

		Predicate.not(isEqualPredicate);

// negate example
		Predicate<Student> nameNegatePredicate = namePredicate.negate();
		List<Student> negateResult = stuList.stream().filter(nameNegatePredicate).collect(Collectors.toList());
		System.out.println(negateResult);

// not example
		Predicate<Student> ageNegatePredicate = Predicate.not(s -> s.getAge() > 18);
		List<Student> notResult = stuList.stream().filter(ageNegatePredicate).collect(Collectors.toList());
		System.out.println(notResult);

// removeIf example
		System.out.println("Student list size before removal : " + stuList.size());
		boolean removed = stuList.removeIf(s -> s.getId() == 100);
		System.out.println(removed);
		System.out.println("Student list size after removal : " + stuList.size());

	}

}

/*
 * Output: Larray is 18 plus [Student [id=200, name=page, age=20], Student
 * [id=101, name=sundar, age=30]] true [Student [id=200, name=page, age=20]]
 * [Student [id=200, name=page, age=20], Student [id=101, name=sundar, age=30],
 * Student [id=202, name=pichai, age=17]] [Student [id=200, name=page, age=20]]
 * [Student [id=100, name=Lary, age=10], Student [id=101, name=sundar, age=30]]
 * [Student [id=100, name=Lary, age=10], Student [id=202, name=pichai, age=17]]
 * Student list size before removal : 4 true Student list size after removal : 3
 */

class Student {

	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {

		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}