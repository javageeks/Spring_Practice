package com.greenhorn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greenhorn.spring.config.ShopConfiguration;
import com.greenhorn.spring.product.Product;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ShopConfiguration.class);
		Product aaa = context.getBean("aaa", Product.class);
		Product cdrw = context.getBean("cdrw", Product.class);
		System.out.println(aaa);
		System.out.println(cdrw);
	}

}
