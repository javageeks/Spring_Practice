package com.springspider.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springspider.spring.mvc.dao.CustomerDao;
import com.springspider.spring.mvc.dao.CustomerRepository;
import com.springspider.spring.mvc.model.Customer;

@Service("customerservice")
@Transactional
public class CustomerService {
	//@Autowired CustomerRepository customerDao;
	@Autowired CustomerDao customerDao;
	
	
	public void save(Customer customer) {
		customerDao.save(customer);
		
	}
	
	public List<Customer> listAll() {
		return (List<Customer>) customerDao.listAll();
		
	}
	
	public Customer get(Long id) {
		return customerDao.get(id);
	}
	
	public void delete(Long id) {
		customerDao.delete(id);
	}
	
	public List<Customer> search(String keyword) {
		return customerDao.search(keyword);
	}
}
