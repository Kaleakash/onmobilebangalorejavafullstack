package service;

import java.util.List;

import dao.EmployeeDao;
import entity.Employee;

public class EmployeeService {

EmployeeDao ed;	

	public String storeEmployeeDetails(Employee emp) {
	if(emp.getSalary()<14000) {
		return "Can't store record, salary must be > 14000";
	}else {
		ed = new EmployeeDao();
		if(ed.storeEmployeeDetails(emp)>0) {
				return "Record stored successfully";
			}else {
				return "Record not store";
			}
		}
	}
	
	public List<Employee> getEmployeeInfo() {
		ed = new EmployeeDao();
		return ed.getEmployeeDetails();
	}
}
