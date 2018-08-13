package com.mzy.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mzy.domain.Employee;

public class TestApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
		SessionFactory sf=(SessionFactory) ac.getBean("sessionFactory");
		Session s=sf.openSession();
		Employee e=new Employee("aa","aa@gmail.com",new java.util.Date(),23.56f);
		
		Transaction t=s.beginTransaction();
		s.save(e);
		t.commit();
		s.close();
		sf.close();
		
	}

}
