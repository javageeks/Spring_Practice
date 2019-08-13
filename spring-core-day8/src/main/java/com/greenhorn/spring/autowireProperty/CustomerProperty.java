package com.greenhorn.spring.autowireProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerProperty {

	@Autowired
	private AddressHome homeaddr;
	@Autowired
	private AddressOffice addrOffice;
	
	public void printCustomerHomeAddress() {
		
		System.out.println("Customer Home Addres"+ homeaddr.getHomeAddress());
		
	}
	
	
	public  void printCustomerOfficeAddress() {
		System.out.println("Customer Office Addres"+ addrOffice.getOficeAddress());
	}
}
