package com.greenhorn.spring.Disc;

import org.springframework.stereotype.Component;

import com.greenhorn.spring.product.Product;

@Component("disc")
public class Disc extends Product {

	private int capacity;

	public Disc() {
		super();
	}

	public Disc(String name, double price) {
		super(name, price);
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
