package com.greenhorn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greenhorn.spring.model.SequenceGenerator;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.greenhorn.spring.model");
		SequenceGenerator generator = context.getBean(SequenceGenerator.class);
		generator.setPrefix("30");
		generator.setSuffix("A");
		generator.setInitial(100000);
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());

	}

}
