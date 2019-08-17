package com.greenhorn.spring.autowireProperty;

import org.springframework.stereotype.Component;

@Component("addrOffice")
public class AddressOffice {

	private String stree1 = "Myoffice, ABC Bulding " ;
	private String stree2 = "Karnataka, India";
	
    public String getOficeAddress() {
    	return stree1 + "" + stree2;
    }


}
