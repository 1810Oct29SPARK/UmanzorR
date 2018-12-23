package com.revature.service;

import com.revature.dao.ReimbursementsDAOImpl;
import com.revature.dao.ReimbursementsDao;

public class ReimbursementService {
	
	ReimbursementsDao reim = new ReimbursementsDAOImpl();
	
	public void subReim(int reimbursementid, int id, String type, String description,  double amount)  {
//	    Date dt = new Date();
//	    String strDateFormat = "dd:MM:YYYY";
//	    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
//	    String formattedDate= dateFormat.format(dt);
		int reimid = reimbursementid;
		int emid = id;
		String reimtype = type;
		String reimdescription = "description";
		double amt = amount;
		reim.addReimbursements(reimid, emid, reimtype, reimdescription, amt);
	}

}