package org.javasavvy.rest.modal;

public class TransferModel {

	private long transferFrom;
	private long transferTo;
	private double amount;
	
	public long getTransferFrom() {
		return transferFrom;
	}
	public void setTransferFrom(long transferFrom) {
		this.transferFrom = transferFrom;
	}
	public long getTransferTo() {
		return transferTo;
	}
	public void setTransferTo(long transferTo) {
		this.transferTo = transferTo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
