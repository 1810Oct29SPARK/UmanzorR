package com.revature.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.model.Credentials;
import com.revature.model.User;
import com.revature.service.AuthenticationService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	AuthenticationService authService = new AuthenticationService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("login.html");
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("handling request");
		// check whether a session exist, otherwise creates a new one
		// overloaded version takes a boolean create param, if false returns
		HttpSession session = req.getSession();
		resp.setContentType("text/html");
		// grab params from request
		Credentials cred = new Credentials(req.getParameter("username"), req.getParameter("password"));
		// attempt to authenticate user
		User u = authService.isValidUser(cred);
		if (authService.isValidUser(cred) != null) {
			session.setAttribute("username", u.getUsername());
			session.setAttribute("username", u.getFirstname());
			session.setAttribute("username", u.getLastname());
			session.setAttribute("username", u.getEmail());
			session.setAttribute("problem", null);
			// redirect user to profile if page is authenticated
			resp.sendRedirect("profile");
		} else {
			session.setAttribute("problem", "invalid credentials");
			//redirect to login page if authentication fails
			resp.sendRedirect("login");
		}

	}
}