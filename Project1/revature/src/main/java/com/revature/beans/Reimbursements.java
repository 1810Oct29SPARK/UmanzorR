package com.revature.beans;

import java.sql.Blob;

public class Reimbursements {

	public Reimbursements(int reimbursementid, int id, String type, String description, Blob image, double amount) {
		super();
		this.reimbursementid = reimbursementid;
		this.id = id;
		this.type = type;
		this.description = description;
		this.image = image;
		this.amount = amount;
	}
	
	public Reimbursements(int reimbursementid, int id, String type, String description,  double amount) {
		super();
		this.reimbursementid = reimbursementid;
		this.id = id;
		this.type = type;
		this.description = description;
		this.amount = amount;
	}

	public Reimbursements() {
	}

	private int reimbursementid;
	private int id;
	private String type;
	private String description;
	private Blob image;
	private double amount;

	public int getReimbursementid() {
		return reimbursementid;
	}

	public void setReimbursementid(int reimbursementid) {
		this.reimbursementid = reimbursementid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Reimbursements [reimbursementid=" + reimbursementid + ", id=" + id + ", type=" + type + ", description="
				+ description + ", image=" + image + ", amount=" + amount + "]";
	}

}
