package org.javasavvy.tutorial.dao;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.javasavvy.tutorial.entity.Account;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountDAO")
@Transactional(propagation=Propagation.REQUIRED)
public class AccountDAOImpl implements AccountDAO{

	@PersistenceContext
	public EntityManager entityManager;
	
	@Transactional(readOnly=false)
	public Account addAccount(Account account) {
		entityManager.persist(account);
		entityManager.flush();
		account.setAccountNumber(account.getAccountNumber());
		return account;
	}

	public Account updateAccount(Account account) {
		
		
		Account updatedAccount = entityManager.merge(account);
		entityManager.flush();
		return updatedAccount;
	}

	public Account getAccount(long accountNumber) {
		Account accountForId = entityManager.find(Account.class, accountNumber);
		entityManager.flush();
		//account.setAccountNumber(account.getAccountNumber());
		return accountForId;
	}

}
