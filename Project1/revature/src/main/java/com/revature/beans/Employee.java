package com.revature.beans;

import java.time.LocalDate;

public class Employee {

	public Employee(int id, String firstname, String lastname, String middle, String title, int manager,
			LocalDate birthdate, String address, int zipcode, String email, String phone) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.middle = middle;
		this.title = title;
		this.manager = manager;
	}

	public Employee() {
	}

	private int id;
	private String firstname;
	private String lastname;
	private String middle;
	private String title;
	private int manager;
	private LocalDate birthdate;
	private String address;
	private int zipcode;
	private String email;
	private String phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddle() {
		return middle;
	}

	public void setMiddle(String middle) {
		this.middle = middle;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getManager() {
		return manager;
	}

	public void setManager(int manager) {
		this.manager = manager;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", middle=" + middle
				+ ", title=" + title + ", manager=" + manager + ", birthdate=" + birthdate + ", address=" + address
				+ ", zipcode=" + zipcode + ", email=" + email + ", phone=" + phone + ", getId()=" + getId()
				+ ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname() + ", getMiddle()="
				+ getMiddle() + ", getTitle()=" + getTitle() + ", getManager()=" + getManager() + ", getBirthdate()="
				+ getBirthdate() + ", getAddress()=" + getAddress() + ", getZipcode()=" + getZipcode() + ", getEmail()="
				+ getEmail() + ", getPhone()=" + getPhone() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}