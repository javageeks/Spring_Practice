package com.greenhorn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greenhorn.spring.product.Product;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.greenhorn.spring");
		Product aaa = context.getBean("battery", Product.class);
		Product cdrw = context.getBean("disc", Product.class);
		System.out.println(aaa);
		System.out.println(cdrw);
	}

}
