package com.revature.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Employee;
import com.revature.util.ConnectionUtil;

public class EmployeesDAOImpl implements EmployeesDao {

	
	public String filename = "connection.properties";

	public Employee getEmployeeById(int id) {
		Employee em = new Employee();
		try (Connection con = ConnectionUtil.getConnection(filename)) {

			String sql = "SELECT * FROM REIMBURSEMENT WHERE EMPLOYEEID = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery(); 
			while (rs.next()) {
				int employeeId = rs.getInt("EMPLOYEEID");
				String firstname = rs.getString("FIRSTNAME");
				String lastname = rs.getString("LASTNAME");
				String middle = rs.getString("MIDDLEINITIAL");
				String title = rs.getString("TITLE");
				int manager = rs.getInt("DIRECTMANAGER");
				String birthdate = rs.getString("BIRTHDATE");
				String address = rs.getString("ADDRESS");
				int zipcode = rs.getInt("ZIPCODE");
				String email = rs.getString("EMAIL");
				String phone = rs.getString("PHONE");
				em = (new Employee(employeeId, firstname, lastname, middle, title, manager, birthdate, address, zipcode,
						email, phone));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return em;

	}

	public List<Employee> getEmployee() {
		List<Employee> em = new ArrayList<Employee>();
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "SELECT * FROM EMPLOYEE";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int employeeId = rs.getInt("EMPLOYEEID");
				String firstname = rs.getString("FIRSTNAME");
				String lastname = rs.getString("LASTNAME");
				String middle = rs.getString("MIDDLEINITIAL");
				String title = rs.getString("TITLE");
				int manager = rs.getInt("DIRECTMANAGER");
				String birthdate = rs.getString("BIRTHDATE");
				String address = rs.getString("ADDRESS");
				int zipcode = rs.getInt("ZIPCODE");
				String email = rs.getString("EMAIL");
				String phone = rs.getString("PHONE");
				em.add(new Employee(employeeId, firstname, lastname, middle, title, manager, birthdate, address,
						zipcode, email, phone));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return em;

	}

	public void addEmployee(String firstName, String lastName, String middle, String title, int manager,
			String birthdate, String address, int zipcode, String email, String phone) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "INSERT INTO EMPLOYEE(FIRSTNAME,LASTNAME,MIDDLEINITIAL,TITLE,DIRECTMANAGER,BIRTHDATE,ADDRESS,ZIPCODE,EMAIL,PHONE) "
					+ "VALUES (?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setString(3, middle);
			pstmt.setString(4, title);
			pstmt.setInt(5, manager);
			pstmt.setString(6, birthdate);
			pstmt.setString(7, address);
			pstmt.setInt(8, zipcode);
			pstmt.setString(9, email);
			pstmt.setString(10, phone);
			System.out.println("Employee Added");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void deleteEmployee(int id) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "DELETE FROM EMPLOYEE " + "WHERE EMPLOYEEID = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			System.out.println("Employee Deleted");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public boolean isManagerOf(Employee manager, Employee emp) {
		return false;
	}	
	
	public void updateEmployee(Employee e, int employeeId) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "UPDATE EMPLOYEES "
					+ "SET FIRSTNAME = ?, LASTNAME = ?, TITLE = ?, PHONE_NUMBER = ?, AGE = ?, REPORTS_TO = ?, ADDRESS = ?, ZIPCODE = ?, IS_MANAGER = ? "
					+ "WHERE EMPLOYEE_ID = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, e.getId());
			pstmt.setString(2, e.getFirstname());
			pstmt.setString(3, e.getLastname());
			pstmt.setString(4, e.getMiddle());
			pstmt.setString(5, e.getTitle());
			pstmt.setInt(6, e.getManager());
			pstmt.setString(7, e.getBirthdate());
			pstmt.setString(8, e.getAddress());
			pstmt.setInt(9, e.getZipcode());
			pstmt.setString(10, e.getEmail());
			pstmt.setString(11, e.getPhone());
			pstmt.executeUpdate();
		} catch (SQLException e2) {
			e2.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
	/*
	 * private static final String filename = "connection.properties";
	 * 
	 * @Override public List<Employee> getEmployee() { List<Employee> bl = new
	 * ArrayList<>(); // try-with-resources.. con will be closed at the end of the
	 * block try (Connection con = ConnectionUtil.getConnection(filename)) { //
	 * write a join which unifies Bear, Cave, and BearType into a ResultSet // map
	 * the ResultSet's entries onto a list of Bear objects String sql =
	 * "SELECT * FROM EMPLOYEE"; Statement stmt = con.createStatement(); ResultSet
	 * rs = stmt.executeQuery(sql); while(rs.next()) { int employeeId =
	 * rs.getInt("EMPLOYEEID"); String firstname = rs.getString("FIRSTNAME"); String
	 * lastname = rs.getString("LASTNAME"); String middle=
	 * rs.getString("MIDDLEINITIAL"); String title = rs.getString("TITLE"); int
	 * manager = rs.getInt("DIRECTMANAGER"); LocalDate birthdate =
	 * rs.getDate("BIRTHDATE").toLocalDate(); String address =
	 * rs.getString("ADDRESS"); int zipcode = rs.getInt("ZIPCODE"); String email =
	 * rs.getString("EMAIL"); String phone = rs.getString("PHONE"); bl.add(new
	 * Employee(employeeId, firstname, lastname, middle, title, manager, birthdate,
	 * address, zipcode, email, phone)); } } catch (SQLException e) {
	 * e.printStackTrace(); } catch (IOException e) { e.printStackTrace(); } return
	 * bl; }
	 */

}