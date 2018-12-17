package com.revature.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Credentials;
import com.revature.util.ConnectionUtil;

public class CredentialsDAOImpl implements CredentialsDao {


	private static final String filename = "connection.properties";

	@Override
	public List<Credentials> getCredentials() {
		List<Credentials> bl = new ArrayList<>();
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			
			String sql = "SELECT * FROM CREDENTIALS";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String username = rs.getString("USERNAME");
				String password = rs.getString("PASSWORD");
				int id = rs.getInt("EMPLOYEEID");
				bl.add(new Credentials(username, password, id));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bl;
	}

}
