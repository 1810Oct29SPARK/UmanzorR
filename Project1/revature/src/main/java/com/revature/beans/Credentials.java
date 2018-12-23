package com.revature.beans;

public class Credentials {

	public Credentials(String username, String password, int employeeId) {
		super();
		this.username = username;
		this.password = password;
		this.id = employeeId;
	}

	public Credentials(String username, String password) {
		super();
		this.username = username;
		this.password = password;

	}

	

	private String username;
	private String password;
	private int id;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Credentials [username=" + username + ", password=" + password + ", id=" + id + ", getUsername()="
				+ getUsername() + ", getPassword()=" + getPassword() + ", getId()=" + getId() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
