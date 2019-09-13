package com.example.springh2boot11919.controller;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class EmployeeContrroller{

	@RequestMapping("/add-employee")
	public String addEmployee() {
		return "add_employee";
	}

}
