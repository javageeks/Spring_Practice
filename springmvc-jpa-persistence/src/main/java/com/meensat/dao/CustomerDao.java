package com.meensat.dao;

import java.util.List;

import com.meensat.model.CustomerModel;

public interface CustomerDao {
	List<CustomerModel> fetchAllCustomers();
	
	CustomerModel fetchCustomerById(Long id);
	
	void saveCustomer(CustomerModel customer);
	
	void deleteCustomer(Long id);
	
	List<CustomerModel> searchCustomers();
	void updateCustomer(CustomerModel customer);
	
}
