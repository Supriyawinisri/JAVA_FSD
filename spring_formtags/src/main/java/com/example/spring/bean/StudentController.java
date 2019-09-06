package com.example.spring.bean;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Controller level mapping
@Controller
@RequestMapping("/student")
public class StudentController {
	
	private StudentDAO stud;

	@GetMapping("/student-form")
	public String viewpage(Model theModel) {
		Student stu = new Student();
		theModel.addAttribute("student", stu);
		return "student-process";
	}
	
	@PostMapping("/processform")
	public String processPage(@ModelAttribute("student") Student student, Model theModel) {
		theModel.addAttribute("temp", student);
		stud.createEmployee(student);
		return "student-details";
	}
	
}
