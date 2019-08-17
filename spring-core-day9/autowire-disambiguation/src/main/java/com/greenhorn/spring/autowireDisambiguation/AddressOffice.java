package com.greenhorn.spring.autowireDisambiguation;

import org.springframework.stereotype.Component;

@Component("office")
public class AddressOffice implements Address{
	
	private String addressType;
	private String stree1 ;
	private String stree2 ;
	
	public String getAddress() {
		return addressType + " " +stree1 +"  " + stree2;
	}

	public void setAddress() {
		this.addressType = "Office Address";
		this.stree1 = "Flot No 7777, 2nd floor, xyz street";
		this.stree2 = "Karnataka, India";
		
	}

}
