package com.demo.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.dto.UserDTO;

@Repository	
public class UserDAOImpl implements UserDAO {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int registerUser(UserDTO dto) {
		String sql = "insert into User(userName,password,email) values(?,?,?)";
		try {
			return jdbcTemplate.update(sql,dto.getUserName(),dto.getPassword(),dto.getEmail());
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
