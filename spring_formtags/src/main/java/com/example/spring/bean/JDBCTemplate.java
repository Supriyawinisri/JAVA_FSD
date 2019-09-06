package com.example.spring.bean;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component(value="jTemplate")
public class JDBCTemplate extends JdbcTemplate{
	
	@Autowired
	private BasicDataSource dsource;

	@PostConstruct
	public void init() {
		setDataSource(dsource);
	}

}
