package org.javasavvy.tutorial.services;

import java.util.List;

import org.javasavvy.rest.modal.AccountModel;
import org.javasavvy.rest.modal.TransferModel;

public interface AccountService {

	public AccountModel addAccount(AccountModel accountModel);
	public List<AccountModel> transferMoney(TransferModel transferModel) throws Exception;
}
