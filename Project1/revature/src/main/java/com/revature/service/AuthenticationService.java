package com.revature.service;

import com.revature.beans.Credentials;
import com.revature.beans.Employee;
import com.revature.dao.EmployeesDao;
import com.revature.dao.EmployeesDAOImpl;
import com.revature.dao.CredentialsDAOImpl;
import com.revature.dao.CredentialsDao;
import com.revature.model.User;
import com.revature.util.ReimbursementUtil;

public class AuthenticationService {
//	
//	CredentialsDao log = new CredentialsDAOImpl();
//	EmployeesDao emp = new EmployeesDAOImpl();
	
	CredentialsDao c = new CredentialsDAOImpl();
	EmployeesDao e = new EmployeesDAOImpl();
	
	public AuthenticationService() {
	}
	
	public Employee isValidUser(Credentials credentials) {
		String username = credentials.getUsername();
		String password = credentials.getPassword();
		Credentials cl = c.login(username, password);
		int id = cl.getId();
		System.out.println(id);
		Employee empl = null;
		if (username != null && password != null) {
			if (username.equals(cl.getUsername()) && password.equals(cl.getPassword())) {
				empl =  e.getEmployee(id);
				System.out.println(empl);
			}
		}
		return empl;
	}
}