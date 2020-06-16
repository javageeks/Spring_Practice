package com.meensat.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.meensat.model.CustomerModel;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    protected EntityManager entityManager;
    
    public EntityManager getEntityManager() {
        return entityManager;
    }
    
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
	public CustomerModel fetchCustomerById(Long id) {
		CustomerModel cust = getEntityManager().find(CustomerModel.class, id);
		return cust;
	}

	public void saveCustomer(CustomerModel customer) {
		getEntityManager().persist(customer);;
	}
	
	@SuppressWarnings("unchecked")
	public List<CustomerModel> fetchAllCustomers() {
		Query query = getEntityManager().createQuery("select c from CustomerModel c");
        List<CustomerModel> resultList = query.getResultList();
        return resultList;
	}

	public void updateCustomer(CustomerModel customer) {
		getEntityManager().merge(customer);
	}
	public void deleteCustomer(Long id) {
		getEntityManager().remove(fetchCustomerById(id));
	}


	public List<CustomerModel> searchCustomers() {
//		template.load(entity, id);
		return null;
	}

}
