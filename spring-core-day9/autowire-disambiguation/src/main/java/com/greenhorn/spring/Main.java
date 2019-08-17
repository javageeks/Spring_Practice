package com.greenhorn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greenhorn.spring.autowireDisambiguation.CustomerDisambiguation;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		
		ApplicationContext disambiguationContext  = new AnnotationConfigApplicationContext("com.greenhorn.spring.autowireDisambiguation");
		CustomerDisambiguation customer_disambiguation =  disambiguationContext.getBean(CustomerDisambiguation.class);
		customer_disambiguation.setAddress();
		customer_disambiguation.printCustomerHomeAddress();
	}

}
