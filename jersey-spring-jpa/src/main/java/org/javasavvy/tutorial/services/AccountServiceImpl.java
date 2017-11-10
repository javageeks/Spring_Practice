package org.javasavvy.tutorial.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.javasavvy.rest.modal.AccountModel;
import org.javasavvy.rest.modal.TransferModel;
import org.javasavvy.tutorial.dao.AccountDAO;
import org.javasavvy.tutorial.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Service("accountService")
@Transactional(propagation=Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService{

	@Autowired(required=true)
	private AccountDAO accountDAO;
	
	public AccountModel addAccount(AccountModel accountModel) {
		Account account = getData(accountModel);
		account.setCreateDate(new Date());
		account.setUpdatedDate(new Date());
		account = accountDAO.addAccount(account);
		accountModel = setData(account);
		
		return accountModel;
	}



	public List<AccountModel> transferMoney(TransferModel transferModel) throws Exception {
		List<AccountModel> updatedAccounts = new ArrayList<AccountModel>();
		double transferAmount = transferModel.getAmount();
		long fromNo = transferModel.getTransferFrom();
		long toNo = transferModel.getTransferTo();
		Account transferFrom = accountDAO.getAccount(transferModel.getTransferFrom());
		double fromAvilableAmount = transferFrom.getBalanceAmount();
	
		//check if the avilableAmount amount is greater than transfer amount
		if(fromAvilableAmount > transferAmount) {
			
			Account  withdrawUpdate =  withdraw(fromNo, transferAmount);
			Account  depositUpdate =  deposit(toNo, transferAmount);
			Account updatedTransferToAc =	accountDAO.updateAccount(depositUpdate);
			Account updatedTransferFromAc =	accountDAO.updateAccount(withdrawUpdate);
			
			//preparing response
			updatedAccounts.add(setData(updatedTransferToAc));
			updatedAccounts.add(setData(updatedTransferFromAc));
			
		}else {
			throw new Exception("insufficent money to perform transaction ..........");
		}
		return updatedAccounts;
	}
	
	private Account withdraw(long acNo, double ammount) {
		Account accountForId = accountDAO.getAccount(acNo);
		double balance = accountForId.getBalanceAmount();
		balance = balance - ammount;
		accountForId.setBalanceAmount(balance);
		accountForId.setUpdatedDate(new Date());
		return accountForId;
	}
	
	private Account deposit(long acNo, double ammount) {
		Account accountForId = accountDAO.getAccount(acNo);
		double balance = accountForId.getBalanceAmount();
		balance = balance + ammount;
		accountForId.setBalanceAmount(balance);
		accountForId.setUpdatedDate(new Date());
		return accountForId;	
	}
	
	// helper methods for object mapping 
	private Account getData(AccountModel accountModel) {
		Account act = new Account();
		act.setAccountHolderName(accountModel.getAccountHolderName());
		act.setTypeOfAccount(accountModel.getTypeOfAccount());
		act.setBalanceAmount(accountModel.getBalanceAmount());
		return act;
		
	}
	
	private AccountModel setData(Account account) {
		AccountModel act = new AccountModel();
		act.setAccountNumber(account.getAccountNumber());
		act.setAccountHolderName(account.getAccountHolderName());
		act.setTypeOfAccount(account.getTypeOfAccount());
		act.setBalanceAmount(account.getBalanceAmount());
		return act;
		
	}
}
