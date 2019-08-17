package com.greenhorn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greenhorn.spring.autowireSetters.CustomerSetter;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext settercontext = new AnnotationConfigApplicationContext("com.greenhorn.spring.autowireSetters");
		CustomerSetter customer_setter = settercontext.getBean(CustomerSetter.class);
		customer_setter.printCustomerHomeAddress();
		//customer_setter.printCustomerOfficeAddress();
		
	
	
	}

}
