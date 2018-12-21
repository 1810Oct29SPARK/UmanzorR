package com.revature.dao;

import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Employee;
import com.revature.beans.Reimbursements;
import com.revature.util.ConnectionUtil;

public class ReimbursementsDAOImpl implements ReimbursementsDao {

	public String filename = "connection.properties";

	public void addReimbursement(Employee e, Reimbursements r) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "INSERT REIMBURSEMENT(EMPLOYEEID,REIMBURSEID,TYPE,DESCRIPTION,IMAGE, AMOUNT) "
					+ "INTO REIMBURSEMENTS " + "VALUES(?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, r.getReimbursementid());
			pstmt.setInt(2, r.getId());
			pstmt.setString(3, r.getType());
			pstmt.setString(4, r.getDescription());
			pstmt.setBlob(4, r.getImage());
			pstmt.setDouble(5, r.getAmount());
			pstmt.executeUpdate();
		} catch (SQLException f) {
			f.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void updateReimbursement(Reimbursements r, int managerId) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "UPDATE REIMBURSEMENTS " + "SET RESOLVED_BY = ? " + "WHERE REIMBURSEMENTID = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, managerId);
			pstmt.setInt(2, r.getReimbursementid());
			pstmt.executeUpdate();
		} catch (SQLException f) {
			f.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void deleteReimbursementById(int id) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "DELETE * FROM REIMBURSEMENTS" + "WHERE REIMBURSEMENTID = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public List<Reimbursements> getReimbursements() {
		List<Reimbursements> reimbursements = new ArrayList<Reimbursements>();
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "SELECT REIMBURSEMENTID, EMPLOYEEID, TYPE, DESCRIPTION, IMAGE, AMOUNT "
					+ "FROM REIMBURSEMENTS";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int reimburseId = rs.getInt("REIMBURSEMENTID");
				int employeeId = rs.getInt("EMPLOYEEID");
				String type = rs.getString("TYPE");
				String description = rs.getString("DESCRIPTION");
				Blob image = rs.getBlob("IMAGE");
				double amount = rs.getInt("AMOUNT");
				reimbursements.add(new Reimbursements(reimburseId, employeeId, type, description, image, amount));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return reimbursements;
	}

}