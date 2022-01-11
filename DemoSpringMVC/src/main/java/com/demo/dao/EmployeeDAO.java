package com.demo.dao;

import java.util.List;

import com.demo.bo.Employee;

public interface EmployeeDAO {

	public int insert(Employee employee);
	
	public int update(Employee employee);
	
	public int delete(Employee employee);
	
	public Employee getEmployee(long empId);
	
	public List<Employee> getAllEmployees();
}
