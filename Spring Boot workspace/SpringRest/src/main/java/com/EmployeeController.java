package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping(value = "say")
	public String sayHello() {
		return "Welcome to Spring MVC With Rest";
	}
	@RequestMapping(value="empJson")
	public Employee getEmployeeJson() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Ramesh");
		emp.setSalary(16000);
		emp.setDesg("Tester");
		return emp;
	}
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "empDb")
	public List<Employee> getEmployeeInfo() {
		return employeeService.getEmployeeDetails();
	}
	
	
}
