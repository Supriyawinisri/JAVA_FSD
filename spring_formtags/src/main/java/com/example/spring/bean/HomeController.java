package com.example.spring.bean;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String getHome() {
		return "main-menu";
	}
	
	@PostMapping("/processform")
	public String processPage() {
		return "student-details";
	}
	
}
