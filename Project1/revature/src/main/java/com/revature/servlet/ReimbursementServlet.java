package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.service.ReimbursementService;
import com.revature.beans.Reimbursements;
import com.revature.model.Reimbursement;

@WebServlet("/submitReim")
public class ReimbursementServlet {
	
Reimbursements reimb = new Reimbursements();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		request.getRequestDispatcher("home.html").include(request, response);
		
		String reimtype = request.getParameter("type");
		String reimdescription = request.getParameter("description");
		String amount = request.getParameter("amount");
		reimb.subReim(Integer.parseInt(id), category, Double.parseDouble(amount));
		

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	
}