package com.greenhorn.spring.autowireDisambiguation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerDisambiguation {

	@Autowired
	@Qualifier("home")
	private Address address;
	
	public void printCustomerHomeAddress() {
		System.out.println("Customer Home Addres"+ address.getAddress());
	}
}
