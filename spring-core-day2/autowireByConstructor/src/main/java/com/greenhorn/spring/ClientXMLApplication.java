package com.greenhorn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greenhorn.spring.model.Developer;

public class ClientXMLApplication {

		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext(
					"SpringBeans.xml");

			Developer developer = (Developer) context.getBean("developer");
			System.out.println(developer);
		
		
	}
}
