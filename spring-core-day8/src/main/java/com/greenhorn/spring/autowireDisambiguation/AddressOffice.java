package com.greenhorn.spring.autowireDisambiguation;

import org.springframework.stereotype.Component;

@Component("office")
public class AddressOffice implements Address{
	
	private String addressType = "Office Address";
	private String stree1 = "Flot No 123, 2nd floor, xyz street";
	private String stree2 = "Karnataka, India";
	
	public String getAddress() {
		return addressType + " " +stree1 +"  " + stree2;
	}

}
