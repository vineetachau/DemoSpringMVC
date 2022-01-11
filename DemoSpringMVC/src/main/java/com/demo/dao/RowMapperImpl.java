package com.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.demo.bo.Employee;

public class RowMapperImpl implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setId(rs.getLong(1));
		emp.setName(rs.getString(2));
		emp.setDepartment(rs.getString(3));
		emp.setDesignation(rs.getString(4));
		emp.setSalary(rs.getDouble(5));
		return emp;
	}

}
