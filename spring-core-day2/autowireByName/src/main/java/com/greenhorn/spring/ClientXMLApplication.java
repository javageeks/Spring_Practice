package com.greenhorn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greenhorn.spring.model.Address;
import com.greenhorn.spring.model.Customer;

public class ClientXMLApplication {

	public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext(
					"SpringBeans.xml");

			Customer cust = (Customer) context.getBean("customer");
			System.out.println(cust);
			Address add = cust.getAddress();
			System.out.println(add.getFulladdress());
		
	}
}
