package com.mvcspring.springdatajpa.service;

import java.util.List;
import java.util.Optional;

import com.mvcspring.springdatajpa.model.Employee;

public interface EmployeeService {
	
	public Employee saveCustomer(Employee employee);
	
	public List<Employee> getEmployee();
	
	public Optional<Employee> getEmployeeById(int id);
	
	public void deleteCustomer(int id);

}
