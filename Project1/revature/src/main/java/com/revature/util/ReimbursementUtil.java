package com.revature.util;

import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Credentials;
import com.revature.beans.Employee;
import com.revature.dao.CredentialsDAOImpl;
import com.revature.dao.CredentialsDao;
import com.revature.dao.EmployeesDAOImpl;
import com.revature.dao.EmployeesDao;

public class ReimbursementUtil {
	EmployeesDAOImpl placeholder = new EmployeesDAOImpl();

	public boolean isManagerOf(Employee manager, Employee e) {
		if (manager.getManager() == 1) {
			return true;
		}
		while (e.getManager() != 1) {
			if (e.getManager() == manager.getId()) {
				return true;
			} else {
				List<Employee> allEmp = placeholder.getEmployees();
				for (Employee e1 : allEmp) {
					if (e1.getId() == e.getManager()) {
						e = e1;
					}
				}
			}
		}
		return false;
	}

//	public boolean isManager(Employee e) {
//		if(e.isManager()) {
//			return true;
//		}
//		return false;
//	}

	public boolean isValidUser(String username, String password) {
		CredentialsDao login = new CredentialsDAOImpl();
		List<Credentials> loginList = new ArrayList<Credentials>();
		loginList = login.getCredentials();
		for (Credentials l : loginList) {
			if (l.getUsername() == username && l.getPassword() == password) {
				return true;
			}
		}
		return false;
	}
}
//	public boolean showManagerPage(String username, String password) {
//		LoginInfoDAO login = new LoginInfoDAOImpl();
//		EmployeeDAO e = new EmployeeDAOImpl();
//		if(isValidUser(username, password)) {
//			int empId = login.getEmployeeIdFromUsername(username);
//			Employee emp = e.getEmployeeById(empId);
//			if(emp.isManager()) {
//				return true;
//			}
//		}
//		return false;
//	}
//}


