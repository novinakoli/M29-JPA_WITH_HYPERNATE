package org.stjohn.service;

import org.stjohn.dao.EmployeeDao;
import org.stjohn.dao.EmployeeDaoImpl;
import org.stjohn.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao;

	// default constructor
	public EmployeeServiceImpl() {
		dao = new EmployeeDaoImpl();
	}

	@Override
	public void addEmployee(Employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
	}

	@Override
	public Employee getEmployee(int id) {
		Employee emp = dao.getEmployee(id);
		return emp;
	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransaction();
	}

	@Override
	public void deleteEmployee(Employee emp) {
		dao.beginTransaction();
		dao.deleteEmployee(emp);
		dao.commitTransaction();

	}

}
