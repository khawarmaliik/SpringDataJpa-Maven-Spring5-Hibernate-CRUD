package com.mvcspring.springdatajpa.dao;

import java.util.List;
import java.util.Optional;

import com.mvcspring.springdatajpa.model.Employee;

public interface EmployeeDao {

	public Employee saveCustomer(Employee employee);
	
	public List<Employee> getEmployee();
	
	public Optional<Employee> getEmployeeById(int id);
	
	public void deleteCustomer(int id);
}
