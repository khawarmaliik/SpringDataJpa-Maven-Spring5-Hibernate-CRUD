package com.mvcspring.springdatajpa.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvcspring.springdatajpa.model.Employee;
import com.mvcspring.springdatajpa.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/list")
	public String listEmployee(Model theModel) {
		List<Employee> employee = employeeService.getEmployee();
		theModel.addAttribute("employee", employee);
		return "list";
	}
	
	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		LOG.debug("inside show customer-form handler method");
		Employee employee = new Employee();
		theModel.addAttribute("employee", employee);
		return "addemps";
		}
	
	@PostMapping("/saveEmployee")
	public String saveCustomer(@ModelAttribute("employee") Employee employee) {
		employeeService.saveCustomer(employee);	
		return "redirect:/employee/list";
		}
	
	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("empId") int id,
									Model theModel){
		Optional<Employee> employee = employeeService.getEmployeeById(id);	
		theModel.addAttribute("employee", employee);
		return "edit";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("empId") int theId) {
		employeeService.deleteCustomer(theId);
		return "redirect:/employee/list";
	}
}