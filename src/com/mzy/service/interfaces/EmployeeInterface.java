package com.mzy.service.interfaces;

import java.util.List;

import com.mzy.domain.Employee;

public interface EmployeeInterface {

	public void addEmployee(Employee e);
	public List<Employee> showEmployee();
	public void updateEmployee(Employee e);
	public void deleteEmployee(java.io.Serializable id);//ађСа
}
