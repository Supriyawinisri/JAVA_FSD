package com.example.springh2boot11919.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String fname;
	private String lname;
	private String email;
	private int hrPerPaid;
	private int contractHrs;
	private double salary;
	private int commision;
	private String empType;

	public Employee() {
		super();
	}

	public Employee(String fname, String lname, String email, String empType) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.empType = empType;
	}

	public Employee(String fname, String lname, String email, int hrPerPaid, int contractHrs, String empType) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.hrPerPaid = hrPerPaid;
		this.contractHrs = contractHrs;
		this.empType = empType;
	}

	public Employee(String fname, String lname, String email, double salary, int commision, String empType) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.salary = salary;
		this.commision = commision;
		this.empType = empType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getHrPerPaid() {
		return hrPerPaid;
	}

	public void setHrPerPaid(int hrPerPaid) {
		this.hrPerPaid = hrPerPaid;
	}

	public int getContractHrs() {
		return contractHrs;
	}

	public void setContractHrs(int contractHrs) {
		this.contractHrs = contractHrs;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getCommision() {
		return commision;
	}

	public void setCommision(int commision) {
		this.commision = commision;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

}
