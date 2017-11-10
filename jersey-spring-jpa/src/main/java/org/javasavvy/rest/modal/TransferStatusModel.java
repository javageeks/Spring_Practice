package org.javasavvy.rest.modal;

import java.util.List;

public class TransferStatusModel {

	private int status;
	private String message;
	private List<AccountModel> updatedAccountInfo;
	
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
	public List<AccountModel> getUpdatedAccountInfo() {
		return updatedAccountInfo;
	}
	public void setUpdatedAccountInfo(List<AccountModel> updatedAccountInfo) {
		this.updatedAccountInfo = updatedAccountInfo;
	}
	
	@Override
	public String toString() {
		return "TransferStatusModel [status=" + status + ", message=" + message + ", updatedAccountInfo="
				+ updatedAccountInfo + "]";
	}
	
	
}
