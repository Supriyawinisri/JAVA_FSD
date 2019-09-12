package com.example.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("stud")
public class StudentDAO {
	
	@Autowired
	private JdbcTemplate jTemplate;
	
		public JdbcTemplate getjTemplate() {
		return jTemplate;
	}

	public void setjTemplate(JDBCTemplate jTemplate) {
		this.jTemplate = jTemplate;
	}

	public void createEmployee(Student student)
	{
		try {
			Object obj[] = {student.getFirstName()};
			String query = "insert into emp(fname) values (shanmugapriya)";
			jTemplate.update(query);
			System.out.println("inserted..!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
