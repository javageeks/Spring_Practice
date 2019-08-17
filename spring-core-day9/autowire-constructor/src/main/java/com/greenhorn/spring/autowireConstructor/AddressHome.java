package com.greenhorn.spring.autowireConstructor;

import org.springframework.stereotype.Component;

@Component
public class AddressHome {

	
	private String stree1 = "Flot No 123, 2nd floor, xyz street";
	private String stree2 = "Karnataka, India";
	
    public String getHomeAddress() {
    	return stree1 + "" + stree2;
    }

	public String getStree1() {
		return stree1;
	}

	public void setStree1(String stree1) {
		this.stree1 = stree1;
	}

	public String getStree2() {
		return stree2;
	}

	public void setStree2(String stree2) {
		this.stree2 = stree2;
	}
	
}
