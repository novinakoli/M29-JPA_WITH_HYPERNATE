package org.stjohn.dao;

import org.stjohn.entities.Employee;

public interface EmployeeDao {
	
	//by default abstract method
	//user defined method for CRUD operation
	
	void addEmployee(Employee emp); //create
	Employee getEmployee(int id); //retrieve
	void updateEmployee(Employee emp); //update
	void deleteEmployee(Employee emp); //delete
	
	//JPA transaction
	void beginTransaction(); //begin
	void commitTransaction(); //close
	
}
