package com.revature.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Employee;
import com.revature.util.ConnectionUtil;

public class EmployeesDAOImpl implements EmployeesDao {

	private static final String filename = "connection.properties";

	@Override
	public List<Employee> getEmployee() {
		List<Employee> bl = new ArrayList<>();
		// try-with-resources.. con will be closed at the end of the block
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			// write a join which unifies Bear, Cave, and BearType into a ResultSet
			// map the ResultSet's entries onto a list of Bear objects
			String sql = "SELECT * FROM EMPLOYEE";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int employeeId  = rs.getInt("EMPLOYEEID");
				String firstname = rs.getString("FIRSTNAME");
				String lastname  = rs.getString("LASTNAME");
				String middle= rs.getString("MIDDLEINITIAL");
				String title = rs.getString("TITLE");
				int manager = rs.getInt("DIRECTMANAGER");
				LocalDate birthdate = rs.getDate("BIRTHDATE").toLocalDate();
				String address  = rs.getString("ADDRESS");
				int zipcode = rs.getInt("ZIPCODE");
				String email  = rs.getString("EMAIL");
				String phone  = rs.getString("PHONE");
				bl.add(new Employee(employeeId, firstname, lastname, middle, title, manager, birthdate, address, zipcode, email, phone)); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bl;
	}

	
	
}