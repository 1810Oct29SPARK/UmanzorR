package com.revature.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Credentials;
import com.revature.beans.Employee;
import com.revature.beans.Location;
import com.revature.dao.CredentialsDAOImpl;
import com.revature.dao.CredentialsDao;
import com.revature.dao.EmployeesDAOImpl;
import com.revature.dao.EmployeesDao;
import com.revature.dao.LocationDAOImpl;
import com.revature.dao.LocationDao;
import com.revature.util.ConnectionUtil;

public class Driver {

	public static void main(String[] args) {
		init();
//		EmployeesDao emp = new EmployeesDAOImpl();
//		List<Employee> em = emp.getEmployee();
//		for (Employee e : em) {
//			System.out.println(e);
//		}
//	}

//		CredentialsDao listCredentials = new CredentialsDAOImpl();
//		List<Credentials> credentials = listCredentials.getCredentials();
//		for (Credentials c : credentials) {
//			System.out.println(c);
//	}
//}
//		EmployeesDao addEmployee = new EmployeesDAOImpl();
//		addEmployee.addEmployee ("Louise", "Parker", "L", "BusinessWoman", 10138, "23-SEPT-79", "3333 Carrot Ave", 33613, "LoPaaa@co.com", "(888)-888-8888");
//;
//	}

//		EmployeesDao deleteEmployee = new EmployeesDAOImpl();
//		deleteEmployee.deleteEmployee(10144);
//	}
//	
		CredentialsDao addNewCredentials = new CredentialsDAOImpl();
		addNewCredentials.addCredentials("JoTe", "12345", 10143);
	}

	static void init() {
		try {
			Connection con = ConnectionUtil.getConnection("connection.properties");
			System.out.println(con);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
