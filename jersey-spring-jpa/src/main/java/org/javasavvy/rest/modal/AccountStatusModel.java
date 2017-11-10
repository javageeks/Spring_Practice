package org.javasavvy.rest.modal;

public class AccountStatusModel {

	private int status;
	private String message;
	private AccountModel account;
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public AccountModel getAccount() {
		return account;
	}
	public void setAccount(AccountModel account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "AccountStatusModel [status=" + status + ", message=" + message + ", account=" + account + "]";
	}
}
