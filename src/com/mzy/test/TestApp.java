package com.mzy.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mzy.domain.Employee;
import com.mzy.service.interfaces.EmployeeInterface;

public class TestApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
		EmployeeInterface ei=(EmployeeInterface) ac.getBean("employeeService");
		
		Employee e=new Employee("ÊÂÎï×¢½â1","bb@gmail.com",new java.util.Date(),25.56f);
		
		ei.addEmployee(e);
		
		
	}

}
