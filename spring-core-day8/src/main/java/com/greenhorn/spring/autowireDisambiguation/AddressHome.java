package com.greenhorn.spring.autowireDisambiguation;

import org.springframework.stereotype.Component;

@Component("home")
public class AddressHome implements Address{

	private String addressType = "Home Address";
	private String stree1 = "Flot No 123, 2nd floor, xyz street";
	private String stree2 = "Karnataka, India";
	
	public String getAddress() {
		return addressType + " " +stree1 +"  " + stree2;
	}
    
}
