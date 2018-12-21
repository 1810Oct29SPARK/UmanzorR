package com.revature.dao;

import java.time.LocalDate;
import java.util.List;

import com.revature.beans.*;

public interface EmployeesDao {

	public Employee getEmployeeById(int id);

	public List<Employee> getEmployee();

	public void addEmployee(String firstName, String lastName, String middle, String title, int manager,
			String birthdate, String address, int zipcode, String email, String phone);

	public void deleteEmployee(int id);

	public boolean isManagerOf(Employee manager, Employee emp);

	public void updateEmployee(Employee e, int employeeId);

}
