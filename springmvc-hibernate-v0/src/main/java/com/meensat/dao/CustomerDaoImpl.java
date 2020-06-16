package com.meensat.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.meensat.model.CustomerModel;

@Repository
public class CustomerDaoImpl implements CustomerDao {


	@Autowired
	private SessionFactory sessionFactory;
	
	public CustomerModel fetchCustomerById(Long id) {
		return (CustomerModel) sessionFactory.getCurrentSession().get(CustomerModel.class, id);
	}

	public void saveCustomer(CustomerModel customer) {
		sessionFactory.getCurrentSession().persist(customer);
	}
	
	@SuppressWarnings("unchecked")
	public List<CustomerModel> fetchAllCustomers() {
		
		List custList = sessionFactory.getCurrentSession().createQuery("from CustomerModel").list();
		  
		 
		return custList;
	}

	public void updateCustomer(CustomerModel customer) {
		sessionFactory.getCurrentSession().update(customer);
	}
	public void deleteCustomer(Long id) {
		sessionFactory.getCurrentSession().delete(fetchCustomerById(id));
	}

	public List<CustomerModel> searchCustomers() {
//		template.load(entity, id);
		return null;
	}

}
