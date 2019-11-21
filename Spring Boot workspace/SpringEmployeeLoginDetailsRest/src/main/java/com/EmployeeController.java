package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "storeEmployeeInfo",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String storeEmployeeDetails(@RequestBody Employee emp) {
	System.out.println("Id is "+emp.getId());
	System.out.println("Id is "+emp.getName());
	System.out.println("Id is "+emp.getSalary());
	return "Welcome "+emp.getName();
	}
	
	@RequestMapping(value = "retrieveEmployeeInfo",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployeeDetails() {
		return employeeService.getEmployeeDetails();
	}
	
}
