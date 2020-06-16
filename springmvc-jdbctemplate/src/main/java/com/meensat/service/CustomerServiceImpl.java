package com.meensat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.meensat.dao.CustomerDao;
import com.meensat.model.CustomerModel;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao dao;
	
	public List<CustomerModel> getAllCustomers() {
		return dao.fetchAllCustomers();
	}

	public CustomerModel fetchCustomerById(Long id) {
		return dao.fetchCustomerById(id);
	}

	
	public void saveCustomer(CustomerModel customer) {
		dao.saveCustomer(customer);
	}


	public void updateCustomer(CustomerModel customer) {
		CustomerModel model = dao.fetchCustomerById(customer.getId());
		if(model!=null){
			model.setName(customer.getName());
			model.setEmail(customer.getEmail());
			model.setAddress(customer.getAddress());
		}
		//dao.updateCustomer(customer);
	
	}

	
	public void deleteCustomer(Long id) {
		dao.deleteCustomer(id);
	}


	public List<CustomerModel> searchCustomers() {
		return dao.fetchAllCustomers();
	}
	
}
