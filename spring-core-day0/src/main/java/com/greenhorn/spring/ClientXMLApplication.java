package com.greenhorn.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.greenhorn.spring.di.model.Address;



public class ClientXMLApplication {

	public static void main(String[] args) {
		
	/* ==================== Java Style Start ==========================*/
		//Address address  = new Address(); // new
		//address.setCity("Bangalore");
		//address.setState("Karnataka");
		//System.out.println(address.getCity());
		
	/* ==================== Java Style End  ==========================*/
		

	/* ==================== Spring Style Start ==========================*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		Address add = (Address)context.getBean("address");
		add.setCity("ABC");
		add.setState("XYZ");
		System.out.println(add.getCity());
		// close the context
		//context.close();
	}
	/* ==================== Spring Style End ==========================*/
}
/* ----------------- point to note ---------------- 
 * 
 * ClassPathXmlApplicationContext is used to get the ApplicationContext object by providing the configuration files location. It has multiple overloaded constructors and we can provide multiple config files also.
 */
