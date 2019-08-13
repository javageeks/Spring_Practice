package com.greenhorn.spring.autowireConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerConstructor {
	
	private AddressHome home;

	@Autowired
	public CustomerConstructor(AddressHome home) {
		this.home = home;
	}
	
	public void printCustomerHomeAddress() {
		
		System.out.println("Customer Home Addres"+ home.getHomeAddress());
		
	}
}
