package com.greenhorn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greenhorn.spring.autowireConstructor.CustomerConstructor;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext constructcontext = new AnnotationConfigApplicationContext("com.greenhorn.spring.autowireConstructor");
		CustomerConstructor customer_construct = constructcontext.getBean(CustomerConstructor.class);
		customer_construct.printCustomerHomeAddress();
		
	}

}
