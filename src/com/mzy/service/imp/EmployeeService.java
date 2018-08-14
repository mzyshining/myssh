package com.mzy.service.imp;

import java.io.Serializable;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import com.mzy.domain.Employee;
import com.mzy.service.interfaces.EmployeeInterface;

//配置事物注解，让spring接管该类所有事物
@Transactional
public class EmployeeService implements EmployeeInterface {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub

		sessionFactory.getCurrentSession().save(e);
	}

	@Override
	public List<Employee> showEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployee(Serializable id) {
		// TODO Auto-generated method stub

	}

}
