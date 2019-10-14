package org.example1.beans;

public class Employee {

	private String name;
	private int age;

	public void printEmployeeDetails() {
		System.out.println("Name : " + name + " Age : " + age);
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

}
