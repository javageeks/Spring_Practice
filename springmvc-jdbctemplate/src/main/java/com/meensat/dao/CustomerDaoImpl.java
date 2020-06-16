package com.meensat.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.meensat.model.CustomerModel;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public CustomerModel fetchCustomerById(Long id) {
		String sql = "SELECT * FROM customerdetails where ID = ?";			
		return jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<CustomerModel>(CustomerModel.class)); 
	       	
	}

	public void saveCustomer(CustomerModel customer) {
		jdbcTemplate.update("INSERT INTO customerdetails (id, name, email, address) VALUES (?, ?, ?, ?)",
				customer.getId(), customer.getName(), customer.getEmail(), customer.getAddress());
		
	}
	
	@SuppressWarnings("unchecked")
	public List<CustomerModel> fetchAllCustomers() {
		List <CustomerModel> customers = jdbcTemplate.query("SELECT * FROM customerdetails", new BeanPropertyRowMapper(CustomerModel.class));
        return customers;
	}

	public void updateCustomer(CustomerModel customer) {
		jdbcTemplate.update("UPDATE customerdetails set name= ? , email=?, address=? where id = ?",
				customer.getName(), customer.getEmail(), customer.getAddress(), customer.getId());
		System.out.println(" update  ....");
	}
	public void deleteCustomer(Long id) {
		String sql = "DELETE FROM customerdetails where ID =?";	
		jdbcTemplate.update(sql, new Object[]{id}); 
	}


	public List<CustomerModel> searchCustomers(String keyword) {
		String sql = "SELECT * FROM customerdetails  WHERE name = ?";
		
		List <CustomerModel> customers = jdbcTemplate.query(sql, new Object[]{keyword},new BeanPropertyRowMapper(CustomerModel.class));
        return customers;
	}

}
