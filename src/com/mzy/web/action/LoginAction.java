package com.mzy.web.action;

import com.mzy.domain.Employee;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport{

	
	private static final long serialVersionUID = 1L;
	
	private Employee employee;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String execute(){
		
		System.out.println("success");
		
		return "success";
	}
}
