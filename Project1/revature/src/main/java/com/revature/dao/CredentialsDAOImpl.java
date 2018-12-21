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

	public Credentials getCredentialsEmployeeId(int id) {
		Credentials credential = new Credentials();
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "SELECT * FROM LOGIN_INFO " + "WHERE EMPLOYEE_ID = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String username = rs.getString("USERNAME");
				String password = rs.getString("PASSWORD");
				int employeeid = rs.getInt("EMPLOYEEID");
				credential = new Credentials(username, password, id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return credential;
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
				c.add(new Credentials(username, password, id));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return c;
	}

}
