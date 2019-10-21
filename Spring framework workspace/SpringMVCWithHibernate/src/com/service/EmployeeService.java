package com.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public List<Employee> getEmployeeDetails() {
		List<Employee> listOfRec = employeeDao.getEmployeeDetails();
		Iterator<Employee> ii = listOfRec.iterator();
		while(ii.hasNext()) {
			Employee emp = ii.next();
			if(emp.getDesg().equalsIgnoreCase("manager")) {
				emp.setSalary(emp.getSalary()+10000);
			}else if(emp.getDesg().equalsIgnoreCase("programmer")) {
				emp.setSalary(emp.getSalary()+5000);
			}else if(emp.getDesg().equalsIgnoreCase("tester")) {
				emp.setSalary(emp.getSalary()+3000);
			}else {
				emp.setSalary(emp.getSalary()+500);
			}
		}
		return listOfRec;
	}
}
