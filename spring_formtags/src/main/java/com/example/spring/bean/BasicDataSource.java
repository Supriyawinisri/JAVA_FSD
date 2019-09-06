package com.example.spring.bean;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component(value="dsource")
public class BasicDataSource extends org.apache.commons.dbcp.BasicDataSource {

	@PostConstruct
	public void init() {
		setUrl("jdbc:mysql://localhost:3306/DB");
		setUsername("priya");
		setPassword("Shanmugapriya@1012");
		setDriverClassName("com.mysql.jdbc.Driver");
	}
	
}
