package com.meensat.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.meensat.springcore.model.Address;
import com.meensat.springcore.model.Student;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student student = (Student)context.getBean("student");
		Address address = (Address)context.getBean("address");
		
		address.setCity("Jaipur");
		address.setState("RAJ");
		address.setPin(123233);
		
		student.setsName("AbhiK");
		student.setAddress(address);
		
		System.out.println(student.getsName());
		System.out.println(student.getAddress());

	}

}
