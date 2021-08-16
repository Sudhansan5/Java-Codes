package com.spring.SpringJdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	int count() {
		int result = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM Student", Integer.class);
		return result;
	}

	public int addStudent(int id, String name) {
		return jdbcTemplate.update("INSERT INTO Student VALUES (?, ?)", id, name);
	}
}