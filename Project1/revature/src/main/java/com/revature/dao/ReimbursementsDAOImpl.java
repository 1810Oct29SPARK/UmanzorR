package com.revature.dao;

import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Reimbursements;
import com.revature.util.ConnectionUtil;

public class ReimbursementsDAOImpl implements ReimbursementsDao {

	private static final String filename = "connection.properties";

	@Override
	public List<Reimbursements> getReimbursements() {
		List<Reimbursements> bl = new ArrayList<>();
		// try-with-resources.. con will be closed at the end of the block
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			// write a join which unifies Bear, Cave, and BearType into a ResultSet
			// map the ResultSet's entries onto a list of Bear objects
			String sql = "SELECT * FROM REIMBURSEMENTS";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int reimbursementid = rs.getInt("REIMBURSEMENTID");
				int id = rs.getInt("EMPLOYEEID");
				String type = rs.getString("TYPE");
				String description = rs.getString("DESCRIPTION");
				Blob image = rs.getBlob("IMAGE");
				int amount = rs.getInt("AMOUNT");
				bl.add(new Reimbursements(reimbursementid, id, type, description, image, amount));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bl;
	}

}