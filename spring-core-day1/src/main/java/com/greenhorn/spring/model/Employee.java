package com.greenhorn.spring.model;

public class Employee {

	private String name;

	private Address address;  //injection 
	
	
	public Employee(String name , Address address) {
		this.name = name;
		this.address=address;
	}
	
	public void printEmpDetails() {
		
		System.out.println(name + address.getCity());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}

}
