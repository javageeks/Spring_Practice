package org.javasavvy.rest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.javasavvy.rest.modal.AccountModel;
import org.javasavvy.rest.modal.AccountStatusModel;
import org.javasavvy.rest.modal.TransferModel;
import org.javasavvy.rest.modal.TransferStatusModel;
import org.javasavvy.tutorial.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Path("/account")
public class AccountRestResource {

	private static  final double INTIAL_BALANCE = 500.00;
	@Autowired(required=true)
	@Qualifier("accountService")
	private AccountService accountService;
	

	

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/create-account")
	public AccountStatusModel createAccount(AccountModel accountModel){
		System.out.println("create Account:"+accountModel.getAccountHolderName());
		AccountModel account = null;
		AccountStatusModel status = new AccountStatusModel();
		try{
			//set initial amount to 500
			accountModel.setBalanceAmount(INTIAL_BALANCE);
			account = accountService.addAccount(accountModel);
					 

			 status.setAccount(account);
			 status.setMessage("Account Created Successfully");
			
		}catch(Exception e){
			status.setStatus(205);
			 status.setMessage("Error in Creating Account:"+e.getMessage());
		}
		
		
		
		return status;
		
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/transfer-money")
	public TransferStatusModel transferMoney(TransferModel transferMode){
		System.out.println("Money Transfer From :"+transferMode.getTransferFrom()+" To "+transferMode.getTransferFrom());
		List<AccountModel> updatedAccounts = new ArrayList<AccountModel>();
		TransferStatusModel status = new TransferStatusModel();
		try{
			 updatedAccounts = accountService.transferMoney(transferMode);
			 status.setUpdatedAccountInfo(updatedAccounts);
			 status.setMessage("Transaction Successfully");
			
		}catch(Exception e){
			status.setStatus(205);
			 status.setMessage("Error in transfering money:"+e.getMessage());
		}
		
		
		
		return status;
		
	}
	

}
