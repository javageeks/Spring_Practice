package org.javasavvy.tutorial.dao;

import org.javasavvy.tutorial.entity.Account;
import org.springframework.stereotype.Repository;

@Repository("accountDao")
public interface AccountDAO {

	public Account addAccount(Account account);
	public Account updateAccount(Account account);
	public Account getAccount(long accountNumber);
}
