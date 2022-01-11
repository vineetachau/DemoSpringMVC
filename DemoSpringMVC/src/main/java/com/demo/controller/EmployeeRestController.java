package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bo.Employee;

@RestController
public class EmployeeRestController {

	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.POST)
	public List<Employee> getAllEmployees() {
		
		return employees();
	}
	
	public List<Employee> employees() {
		Employee e1 = new Employee(111,"Rahul", "CRM", "Lead", 30000);
		Employee e2 = new Employee(111,"Rahul", "CRM", "NSC", 10000);
		Employee e3 = new Employee(111,"Rahul", "Tech", "SE", 20000);
		Employee e4 = new Employee(111,"Rahul", "Tech", "Lead", 25000);
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		return list;
	}
}
