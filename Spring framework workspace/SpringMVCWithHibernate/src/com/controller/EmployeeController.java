package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Employee;
import com.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "displayEmpDetails")
	public ModelAndView displayEmployeeDetails() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display.jsp");
		List<Employee> listOfRec = employeeService.getEmployeeDetails();
		mav.addObject("employees", listOfRec);
		return mav;
	}
}
