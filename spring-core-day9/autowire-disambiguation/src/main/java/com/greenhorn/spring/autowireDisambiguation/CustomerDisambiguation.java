package com.greenhorn.spring.autowireDisambiguation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerDisambiguation {

	@Autowired
	@Qualifier("office")
	private Address address;
	
	/*Address add1 = new AddressHome();
	Address add2 = new AddressOffice();*/
	
	public void setAddress() {
		
		address.setAddress();
	}
	
	public void printCustomerHomeAddress() {
		System.out.println("Customer Home Addres"+ address.getAddress());
	}
}
