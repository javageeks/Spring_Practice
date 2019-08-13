package com.greenhorn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greenhorn.spring.autowireConstructor.CustomerConstructor;
import com.greenhorn.spring.autowireDisambiguation.CustomerDisambiguation;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		ApplicationContext propertycontext = new AnnotationConfigApplicationContext("com.greenhorn.spring.autowireProperty");
//
//		Customer customer_property = propertycontext.getBean(CustomerProperty.class);
//		customer_property.printCustomerHomeAddress();
//		customer_property.printCustomerOfficeAddress();
		
		//ApplicationContext settercontext = new AnnotationConfigApplicationContext("com.greenhorn.spring.autowireSetters");
		//CustomerSetter customer_setter = settercontext.getBean(CustomerSetter.class);
		//customer_setter.printCustomerHomeAddress();
		//customer_setter.printCustomerOfficeAddress();
		
		
//		ApplicationContext constructcontext = new AnnotationConfigApplicationContext("com.greenhorn.spring.autowireConstructor");
//		CustomerConstructor customer_construct = constructcontext.getBean(CustomerConstructor.class);
//		customer_construct.printCustomerHomeAddress();
		
		ApplicationContext disambiguationContext  = new AnnotationConfigApplicationContext("com.greenhorn.spring.autowireDisambiguation");
		CustomerDisambiguation customer_disambiguation =  disambiguationContext.getBean(CustomerDisambiguation.class);
		customer_disambiguation.printCustomerHomeAddress();
	}

}
