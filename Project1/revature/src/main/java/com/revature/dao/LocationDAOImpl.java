package com.revature.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Location;
import com.revature.util.ConnectionUtil;

public class LocationDAOImpl implements LocationDao {

	private static final String filename = "connection.properties";

	@Override
	public List<Location> getLocation() {
		List<Location> loc = new ArrayList<>();
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			
			String sql = "SELECT * FROM LOCATION ";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int zipcode = rs.getInt(1);
				String city = rs.getString(2);
				String state = rs.getString(3);
				loc.add(new Location(zipcode, city, state));
				
			}
			System.out.println(loc);

			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return loc;
	}

}