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

import com.revature.beans.Employee;
import com.revature.dao.EmployeesDao;
import com.revature.dao.EmployeesDAOImpl;

@WebServlet("/employeeList")
public class EmployeelistServlet extends HttpServlet {
	
	EmployeesDao emp = new EmployeesDAOImpl();

	/**
	 * 
	 */
	private static final long serialVersionUID = 6218686138968746200L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// grab current session, if it exists
		response.setContentType("application/json");
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("email") != null) {
			try {
				List<Employee> employees = emp.getEmployees();
				List<Employee> list = new ArrayList<>();
				int i = 0;
				for (Employee e : employees) {
					//System.out.println(e);
					list.add(e);
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