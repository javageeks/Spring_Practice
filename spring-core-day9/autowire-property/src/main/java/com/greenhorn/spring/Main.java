package com.greenhorn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greenhorn.spring.autowireProperty.CustomerProperty;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext propertycontext = new AnnotationConfigApplicationContext("com.greenhorn.spring.autowireProperty");

		CustomerProperty customer_property = propertycontext.getBean(CustomerProperty.class);
		customer_property.printCustomerHomeAddress();
		customer_property.printCustomerOfficeAddress();
		
	
	}

}
