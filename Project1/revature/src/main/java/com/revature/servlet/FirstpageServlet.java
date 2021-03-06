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

@WebServlet("/1stPage")
public class FirstpageServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1457614168668021195L;

	AuthenticationService AuthService = new AuthenticationService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("handling request...");
		// checks whether a session exists, otherwise creates a new one.
		// overloaded version takes a boolean create param, if false it returns
		// null if no session exists for the current request.
		HttpSession session = req.getSession();
		resp.setContentType("text/html");
		// grab params from request
		Credentials cred = new Credentials(req.getParameter("username"), req.getParameter("password"));
		// attempt to authenticate the user
		Employee u = AuthService.isValidUser(cred);
		// set user information as session attributes
		if (u != null) {
			session.setAttribute("userId", u.getId());
			session.setAttribute("firstname", u.getFirstname());
			session.setAttribute("lastname", u.getLastname());
			session.setAttribute("email", u.getEmail());
			session.setAttribute("problem", null);
			// redirect user to profile page if authenticated
			resp.sendRedirect("profile");
		} else {
			session.setAttribute("problem", "invalid credentials");
			// redirect user to login page if authentication fails
			resp.sendRedirect("login");
		}

	}
}