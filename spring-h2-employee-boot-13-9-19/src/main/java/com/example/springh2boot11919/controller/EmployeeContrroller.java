package com.example.springh2boot11919.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springh2boot11919.model.Employee;
import com.example.springh2boot11919.repository.EmployeeRepository;

@Controller
@RequestMapping("/api")
public class EmployeeContrroller{
	
	EmployeeRepository employeeRepository;

	public EmployeeContrroller(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	
	@RequestMapping("/home")
	public String goHome() {
		return "home";
	}

	@PostMapping("/add-employee")
	public String addEmployee(Model theModel) {
		Employee theEmployee = new Employee();
		theModel.addAttribute("employee", theEmployee);
		return "add_employee";
	}
	
	@PostMapping("/save-employee")
	public String saveEmployee(@ModelAttribute("employee") Employee theEmployee,Model theModel) {
		
		theModel.addAttribute("saveemployee", theEmployee);
		
		if(theEmployee.getEmpType().equals("Employee")) {
			employeeRepository.save(theEmployee);
			return "redirect:/api/home";
		}
		else if(theEmployee.getEmpType().equals("Permanent_Employee")) {			
			return "permanent_employee";
		}
		else if(theEmployee.getEmpType().equals("Contract_Employee")){
			return "contract_employee";
		}
		else {
			return "error!!!";
		}
	}
	
	@PostMapping("/save-permanent-employee")
	public String savePermanentEmployee() {
		
		return "";
	}
	
	@PostMapping("/save-other-employee")
	public String saveContractEmployee(@ModelAttribute("saveemployee") Employee theEmployee,Model theModel) {
		employeeRepository.save(theEmployee);
		System.out.println();
		System.out.println(theEmployee.getHrPerPaid());
		return "redirect:/api/home";
	}

}
