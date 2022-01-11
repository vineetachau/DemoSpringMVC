package com.demo.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.bo.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Employee employee) {
		String sql = "insert into Employee(name,department,designation,salary) values(?,?,?,?)";
		try {
			return this.jdbcTemplate.update(sql,employee.getName(),employee.getDepartment(),
					employee.getDesignation(),employee.getSalary());
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}

	@Override
	public int update(Employee employee) {
		String sql = "update Employee set name=? , department=? , "
				+ "designation=? , salary=? where id=?";
		try {
			return this.jdbcTemplate.update(sql,employee.getName(),employee.getDepartment(),
					employee.getDesignation(),employee.getSalary(),employee.getId());
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}

	@Override
	public int delete(Employee employee) {
		String sql = "Delete from Employee where id=?";
		try {
			return this.jdbcTemplate.update(sql,employee.getId());
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	@Override
	public Employee getEmployee(long empId) {
		String sql = "Select * from Employee where id=?";
		RowMapper<Employee> row = new RowMapperImpl();
		Employee emp = this.jdbcTemplate.queryForObject(sql, row, empId);
		return emp;
	}
	@Override
	public List<Employee> getAllEmployees() {
		String sql = "Select * from Employee";
		List<Employee> emps = this.jdbcTemplate.query(sql, new RowMapperImpl());
		return emps;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



}
