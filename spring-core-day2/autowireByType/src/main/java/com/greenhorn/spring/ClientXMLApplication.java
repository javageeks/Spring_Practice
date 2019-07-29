package com.greenhorn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greenhorn.spring.model.Person;

public class ClientXMLApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

	
		Person person = (Person) context.getBean("person");
		System.out.println(person);
		System.out.println(person.getCust().getName());
		
		
		
		/*	Customer cust = (Customer)context.getBean("customer");
		System.out.println(cust);*/
	}
}