package com.meensat.service;

import java.util.List;

import com.meensat.model.CustomerModel;

public interface CustomerService {

	List<CustomerModel> getAllCustomers();
	CustomerModel fetchCustomerById(Long id);
	
	void saveCustomer(CustomerModel customer);
	
	void updateCustomer(CustomerModel customer);
	
	void deleteCustomer(Long id);
	
	List<CustomerModel> searchCustomers();
}
