package com.mzy.domain;

import java.util.Date;

public class Employee {
	private Integer id;
	private String name;
	private String email;
	private String pwd;
	private Integer grade;
	private java.util.Date hiredate;
	private Float salary;
	
	
	public Employee()
	{
		
	}
	public Employee(String name, String email, Date hiredate,
			Float salary) {
		
		
		this.name = name;
		this.email = email;
		this.hiredate = hiredate;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public java.util.Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(java.util.Date hiredate) {
		this.hiredate = hiredate;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
}
