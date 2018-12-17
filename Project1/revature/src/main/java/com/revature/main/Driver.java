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
		EmployeesDao ld = new EmployeesDAOImpl();
		ld.getEmployee();
		System.out.println(ld.getEmployee());
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


