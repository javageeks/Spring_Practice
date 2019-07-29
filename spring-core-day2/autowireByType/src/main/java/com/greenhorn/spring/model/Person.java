package com.greenhorn.spring.model;
 
public class Person 
{
	private Ability ability;
    private Customer cust;
    
	public Ability getAbility() {
		return ability;
	}

	public void setAbility(Ability ability) {
		this.ability = ability;
	}

	/*@Override
	public String toString() {
		return "Person [ability=" + ability + "]";
	}*/

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	@Override
	public String toString() {
		return "Person [ability=" + ability + ", cust=" + cust + "]";
	}

}