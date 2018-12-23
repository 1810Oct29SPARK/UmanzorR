package com.revature.model;

public class Reimbursement {
	
	public Reimbursement(int emId, String description, Double amount) {
		super();
		this.emId = emId;
		this.description = description;
		this.amount = amount;
	}
	private int emId;
	private String description;
	private Double amount;
	public int getEmId() {
		return emId;
	}
	public void setEmId(int emId) {
		this.emId = emId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Reimbursements [emId=" + emId + ", description=" + description + ", amount=" + amount + ", getEmId()="
				+ getEmId() + ", getDescription()=" + getDescription() + ", getAmount()=" + getAmount()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}