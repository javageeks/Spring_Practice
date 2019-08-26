package com.springspider.spring.mvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springspider.spring.mvc.model.Customer;

@Repository
@Transactional
@Qualifier("customerDao")
public class CustomerDao{

@Autowired
private HibernateTemplate hibernateTemplate;

@Transactional
public void save(Customer customer) {
	this.hibernateTemplate.save(customer);
		System.out.println("Save  ....");
	}

	public void updateCustomer(Customer customer) {
		//hibernateTemplate.
		System.out.println(" update  ....");
	}
	
	public List<Customer> listAll() {
		return this.hibernateTemplate.loadAll(Customer.class);
	}

	public Customer get(Long id) {
		
    return null;
	}

	public void delete(Long id) {
	
	}

	public List<Customer> search(String keyword) {
		return null;
	}
}
