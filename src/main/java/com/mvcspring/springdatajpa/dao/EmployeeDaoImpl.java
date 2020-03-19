package com.mvcspring.springdatajpa.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mvcspring.springdatajpa.model.Employee;
import com.mvcspring.springdatajpa.repository.EmployeeRepository;

@Service
public class EmployeeDaoImpl implements EmployeeDao {
EmployeeRepository employeeRepository;
	
	public EmployeeDaoImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public Employee saveCustomer(Employee employee) {
		return employeeRepository.saveAndFlush(employee);
	}

	public List<Employee> getEmployee() {
		return employeeRepository.findAll();
	}

	public Optional<Employee> getEmployeeById(int id){
		return employeeRepository.findById(id);
	}

	public void deleteCustomer(int id) {
		employeeRepository.deleteById(id);
	}
}
