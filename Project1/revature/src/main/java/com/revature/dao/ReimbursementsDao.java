package com.revature.dao;

import java.util.List;

import com.revature.beans.Employee;
import com.revature.beans.Reimbursements;

public interface ReimbursementsDao {
	public List<Reimbursements> getReimbursements();
	public void addReimbursement(Employee e, Reimbursements r);
	public void updateReimbursement(Reimbursements r, int managerId);
	public void deleteReimbursementById(int id);

}
