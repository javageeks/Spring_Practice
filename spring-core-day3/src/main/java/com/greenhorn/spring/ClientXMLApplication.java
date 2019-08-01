package com.greenhorn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greenhorn.spring.model.Customer;

public class ClientXMLApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });

		Customer custA = (Customer) context.getBean("customerService");
		custA.setMessage("Message by custA");
		System.out.println("Message : " + custA.getMessage());

		// retrieve it again
		Customer custB = (Customer) context.getBean("customerService");
		System.out.println("Message : " + custB.getMessage());
	}

}
/*
 * ----------------- point to note ----------------
 * 
 * ClassPathXmlApplicationContext is used to get the ApplicationContext object
 * by providing the configuration files location. It has multiple overloaded
 * constructors and we can provide multiple config files also.
 */
