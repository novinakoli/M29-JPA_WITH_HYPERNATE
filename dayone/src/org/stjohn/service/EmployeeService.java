package org.stjohn.service;

import org.stjohn.entities.Employee;

public interface EmployeeService {

	// User defined method for CURD operation

	void addEmployee(Employee emp);// create

	Employee getEmployee(int id); // retrieve

	void updateEmployee(Employee emp); // update
	// void removeEmployee(Employee emp); //delete

	void deleteEmployee(Employee emp);

}
