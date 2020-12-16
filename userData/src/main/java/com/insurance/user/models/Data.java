package com.insurance.user.models;

public class Data {
	private boolean fatca;
	private String note;
	private String amount;
	
	public boolean isFatca() {
		return fatca;
	}
	public void setFatca(boolean fatca) {
		this.fatca = fatca;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
}
