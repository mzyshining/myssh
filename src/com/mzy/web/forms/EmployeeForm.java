package com.mzy.web.forms;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.Form;

import com.opensymphony.xwork2.util.ValueStack;


public class EmployeeForm extends Form {

	public EmployeeForm(ValueStack stack, HttpServletRequest request,
			HttpServletResponse response) {
		super(stack, request, response);
		// TODO Auto-generated constructor stub
		System.out.println("into employeeForm");
	}
	private String id;
	private String pwd;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	
}
