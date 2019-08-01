package com.greenhorn.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greenhorn.spring.model.Person;


public class ClientXMLApplication {

	public static void main(String[] args) {

		// Reading configuration from the spring configuration file.
		ConfigurableApplicationContext   context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Person myperson = context.getBean("personBean", Person.class);

		System.out.println("Name= " + myperson.getName());

		// Closing the context object.
		context.close();
	}

}
/*
 * ----------------- point to note ----------------
 * 
 * ClassPathXmlApplicationContext is used to get the ApplicationContext object
 * by providing the configuration files location. It has multiple overloaded
 * constructors and we can provide multiple config files also.
 */
