package com.greenhorn.spring.Battery;

import org.springframework.stereotype.Component;

import com.greenhorn.spring.product.Product;

@Component("battery")
public class Battery extends Product {

	private boolean rechargeable;

	public Battery() {
		super();
	}

	public Battery(String name, double price) {
		super(name, price);
	}

	public boolean isRechargeable() {
		return rechargeable;
	}

	public void setRechargeable(boolean rechargeable) {
		this.rechargeable = rechargeable;
	}

}
