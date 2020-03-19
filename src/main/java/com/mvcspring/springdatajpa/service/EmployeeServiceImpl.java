package com.mvcspring.springdatajpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mvcspring.springdatajpa.dao.EmployeeDaoImpl;
import com.mvcspring.springdatajpa.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDaoImpl employeeDaoImpl;
	
	public EmployeeServiceImpl(EmployeeDaoImpl employeeDaoImpl) {
		this.employeeDaoImpl = employeeDaoImpl;
	}
	
	public Employee saveCustomer(Employee employee) {
		return employeeDaoImpl.saveCustomer(employee);
	}

	public List<Employee> getEmployee() {
		return employeeDaoImpl.getEmployee();
	}

	public Optional<Employee> getEmployeeById(int id){
		return employeeDaoImpl.getEmployeeById(id);
	}

	public void deleteCustomer(int id) {
		employeeDaoImpl.deleteCustomer(id);;
	}

}
