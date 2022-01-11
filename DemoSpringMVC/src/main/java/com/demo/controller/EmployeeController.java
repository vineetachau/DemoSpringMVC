package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bo.Employee;
import com.demo.dao.EmployeeDAO;

@Controller
public class EmployeeController {

	@RequestMapping("/insertEmployeeInput")
	public ModelAndView insertEmployeeInput() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("employeeInput.jsp");
		return mv;
	}

	@SuppressWarnings("resource")
	@RequestMapping("/employeeList")
	public ModelAndView list() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/jdbc/config.xml");
		EmployeeDAO empDao = context.getBean("empDao",EmployeeDAO.class);
		List<Employee> list = empDao.getAllEmployees();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("employeeList.jsp");
		mv.addObject("list",list);
		return mv;
	}

	@SuppressWarnings("resource")
	@RequestMapping("/insertEmployee")
	public ModelAndView insertEmployee(HttpServletRequest request) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/jdbc/config.xml");
		EmployeeDAO empDao = context.getBean("empDao",EmployeeDAO.class);
		final String name = request.getParameter("name");
		final String dep = request.getParameter("department");
		final String des = request.getParameter("designation");
		final double salary = Double.parseDouble(request.getParameter("salary"));

		Employee e = new Employee();
		e.setName(name);
		e.setDepartment(dep);
		e.setDesignation(des);
		e.setSalary(salary);

		int result = empDao.insert(e);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("registerResult.jsp");
		mv.addObject("result","Employee added "+result);
		return mv;
	}

	@SuppressWarnings("resource")
	@RequestMapping("/updateEmployeeInput")
	public ModelAndView updateEmployeeInput(@RequestParam long empId) {
		ModelAndView mv = new ModelAndView();
		ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/jdbc/config.xml");
		EmployeeDAO empDao = context.getBean("empDao",EmployeeDAO.class);
		Employee emp = empDao.getEmployee(empId);
		System.out.println(emp.getName());
		mv.setViewName("updateEmployeeInput.jsp");
		mv.addObject("empObj",emp);
		return mv;
	}

	@SuppressWarnings("resource")
	@RequestMapping("/updateEmployee")
	public ModelAndView updateEmployee(HttpServletRequest request) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/jdbc/config.xml");
		EmployeeDAO empDao = context.getBean("empDao",EmployeeDAO.class);
		final long empId = Long.parseLong(request.getParameter("empId"));
		final String name = request.getParameter("name");
		final String dep = request.getParameter("department");
		final String des = request.getParameter("designation");
		final double salary = Double.parseDouble(request.getParameter("salary"));

		Employee e = new Employee();
		e.setId(empId);
		e.setName(name);
		e.setDepartment(dep);
		e.setDesignation(des);
		e.setSalary(salary);

		int result = empDao.update(e);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("registerResult.jsp");
		mv.addObject("result","Employee Updated "+result);
		return mv;
	}
	
	@SuppressWarnings("resource")
	@RequestMapping("/deleteEmployeeInput")
	public ModelAndView deleteEmployeeInput(@RequestParam long empId) {
		ModelAndView mv = new ModelAndView();
		ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/jdbc/config.xml");
		EmployeeDAO empDao = context.getBean("empDao",EmployeeDAO.class);
		Employee emp = empDao.getEmployee(empId);
		int result = empDao.delete(emp);
		mv.setViewName("registerResult.jsp");
		mv.addObject("result","Employee Deleted "+result);
		return mv;
	}

}
