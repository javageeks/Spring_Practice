package com.meensat.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.meensat.model.CustomerModel;

@Repository
public class CustomerDaoImpl extends AbstractDao<Long, CustomerModel> implements CustomerDao {

	
	public CustomerModel fetchCustomerById(Long id) {
		CustomerModel cust = getByKey(id);
		return cust;
	}

	public void saveCustomer(CustomerModel customer) {
		persist(customer);
	}
	
	@SuppressWarnings("unchecked")
	public List<CustomerModel> fetchAllCustomers() {
		Criteria criteria = createEntityCriteria();
		List<CustomerModel> list = (List<CustomerModel>) criteria.list();
		return list;
	}

	public void updateCustomer(CustomerModel customer) {
		update(customer);
	}
	public void deleteCustomer(Long id) {
		delete(fetchCustomerById(id));
	}


	public List<CustomerModel> searchCustomers() {
//		template.load(entity, id);
		return null;
	}

}
