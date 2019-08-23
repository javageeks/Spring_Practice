package com.springspider.spring.mvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springspider.spring.mvc.model.Customer;

@Repository
@Qualifier("customerDao")
public class CustomerDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void save(Customer customer) {
		jdbcTemplate.update("INSERT INTO customer (id, name, email, address) VALUES (?, ?, ?, ?)",
				customer.getId(), customer.getName(), customer.getEmail(), customer.getAddress());
		
		System.out.println("Save  ....");
	}

	public void updateCustomer(Customer customer) {
		jdbcTemplate.update("UPDATE customer set name= ? , email=?, address=? where id = ?",
				customer.getName(), customer.getEmail(), customer.getAddress(), customer.getId());
		System.out.println(" update  ....");
	}
	
	public List<Customer> listAll() {
		List <Customer> customers = jdbcTemplate.query("SELECT * FROM customer", new BeanPropertyRowMapper(Customer.class));
        return customers;
	}

	public Customer get(Long id) {
		
    String sql = "SELECT * FROM customer where ID = ?";			
	return jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Customer>(Customer.class)); 
       	
	}

	public void delete(Long id) {
	String sql = "DELETE FROM customer where ID =?";	
	jdbcTemplate.update(sql, new Object[]{id}); 
           
	}

	public List<Customer> search(String keyword) {
		String sql = "SELECT * FROM CUSTOMER  WHERE name = ?";
		List <Customer> customers = jdbcTemplate.query(sql, new Object[]{keyword},new BeanPropertyRowMapper(Customer.class));
        return customers;
	}
}
