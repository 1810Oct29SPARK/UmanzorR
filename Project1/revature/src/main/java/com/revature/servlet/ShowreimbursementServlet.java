package com.revature.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.revature.beans.*;
import com.revature.dao.EmployeesDAOImpl;
import com.revature.dao.EmployeesDao;
import com.revature.dao.ReimbursementsDAOImpl;
import com.revature.dao.ReimbursementsDao;
import com.revature.model.Reimbursement;


@WebServlet("/reimList")
public class ShowreimbursementServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6561094542638876515L;


	
	ReimbursementsDao reim = new ReimbursementsDAOImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// grab current session, if it exists
		response.setContentType("application/json");
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("email") != null) {
			try {
				List<Reimbursements> reimbursemsnts = reim.listReimbursements((int) session.getAttribute("userId"));
				List<Reimbursements> list = new ArrayList<>();
				int i = 0;
				for (Reimbursements r : reimbursemsnts) {
					//System.out.println(e);
					list.add(r);
				}
				response.getWriter().write((new ObjectMapper()).writeValueAsString(list));
				} catch (Exception e) {
				e.printStackTrace();
				response.getWriter().write("{\"listEmployee\":null}");
			}
		} else {
			response.getWriter().write("{\"listEmployee\":null}");
		}
	}

}