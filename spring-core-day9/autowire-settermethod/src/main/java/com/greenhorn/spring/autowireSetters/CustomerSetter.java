package com.greenhorn.spring.autowireSetters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class CustomerSetter {

	
	private AddressHome homeaddrsetter;
	
	
	//Business method
	public void printCustomerHomeAddress() {
		
		System.out.println("Customer Home Addres ::"+ homeaddrsetter.getHomeAddress());
		
	}

	public AddressHome getHomeaddrsetter() {
		return homeaddrsetter;
	}

	@Autowired
	public void setHomeaddrsetter(AddressHome homeaddrsetter) {
		this.homeaddrsetter = homeaddrsetter;
	}

	

}
