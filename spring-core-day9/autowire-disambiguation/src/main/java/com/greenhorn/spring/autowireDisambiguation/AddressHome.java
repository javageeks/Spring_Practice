package com.greenhorn.spring.autowireDisambiguation;

import org.springframework.stereotype.Component;

@Component("home")
public class AddressHome implements Address{

	private String addressType;
	private String stree1;
	private String stree2;
	
	public String getAddress() {
		return addressType + " " +stree1 +"  " + stree2;
	}

	public void setAddress() {
		
		this.addressType = "Home Address";
		this.stree1 = "Flot No 123, 2nd floor, xyz street";
		this.stree2 = "Karnataka, India";
	}
    
}
