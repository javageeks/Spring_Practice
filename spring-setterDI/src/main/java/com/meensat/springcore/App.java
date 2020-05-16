package com.meensat.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.meensat.springcore.model.Student;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student student = (Student)context.getBean("student");
		
		System.out.println(student.getsName());
		
		student.setsName("AbhiK");
		
		System.out.println(student.getsName());

	}

}
