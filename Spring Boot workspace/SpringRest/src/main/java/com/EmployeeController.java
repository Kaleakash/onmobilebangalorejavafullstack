package com;

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
}
