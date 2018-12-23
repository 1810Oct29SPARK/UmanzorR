package com.revature.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.beans.Credentials;
import com.revature.beans.Employee;
import com.revature.model.User;
import com.revature.service.AuthenticationService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 742654176099996938L;
	AuthenticationService authService = new AuthenticationService();

	//return Login page for GET request
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("profile.html").forward(req, resp);
	}
	
	//handle POST request from form on Login page
	//(or anywhere else)
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		resp.setContentType("text/html");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		Credentials cred = new Credentials(username, password);
		Employee e = authService.isValidUser(cred);
		if (e != null) {
			session.setAttribute("employeeId", e.getId());
			session.setAttribute("firstname", e.getFirstname());
			session.setAttribute("lastname", e.getLastname());
			session.setAttribute("email", e.getEmail());
			session.setAttribute("problem", null);
			resp.sendRedirect("profile");
		} else {
			session.setAttribute("problem", "invalid credentials");
			resp.sendRedirect("About");
		}

	}

}

