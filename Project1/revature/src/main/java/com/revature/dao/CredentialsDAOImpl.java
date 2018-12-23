package com.revature.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Credentials;
import com.revature.util.ConnectionUtil;

public class CredentialsDAOImpl implements CredentialsDao {

	public String filename = "connection.properties";

	public void addCredentials(String username, String password, int id) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "INSERT INTO CREDENTIALS(USERNAME, PASSWORD, EMPLOYEEID) VALUES (?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			pstmt.setInt(3, id);
			System.out.println("Credential Added");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void updateCredentials(String username, String password, int id) {

	}

	public void deleteCredentialsByEmployeeId(int id) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "DELETE * FROM CREDENTIALS " + "WHERE EMPLOYEEID = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public int getCredentialsEmployeeUsername(String username) {
		try(Connection con = ConnectionUtil.getConnection(filename)){
			String sql = "SELECT EMPLOYEID FROM CREDENTIALS " + 
						"WHERE USERNAME = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int employeeId = rs.getInt("EMPLOYEE_ID");
				return employeeId;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return -1;
	}

	public List<Credentials> getCredentials() {
		List<Credentials> c = new ArrayList<>();
		try (Connection con = ConnectionUtil.getConnection(filename)) {

			String sql = "SELECT * FROM CREDENTIALS";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String username = rs.getString("USERNAME");
				String password = rs.getString("PASSWORD");
				int id = rs.getInt("EMPLOYEEID");
				c.add(new Credentials(username, password));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return c;
	}
	
	public Credentials login(String username, String password) {
		Credentials cl = new Credentials(null, null, 0);
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "SELECT * FROM CREDENTIALS WHERE USERNAME = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, username);
//			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String username1 = rs.getString("USERNAME");
				String password1 = rs.getString("PASSWORD");
				int id1 = rs.getInt("EMPLOYEEID");
				cl = new Credentials(username1, password1, id1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return cl;
	}

}
