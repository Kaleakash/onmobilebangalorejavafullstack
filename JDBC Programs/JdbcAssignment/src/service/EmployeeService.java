package service;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Employee;
import dao.EmployeeDao;

public class EmployeeService {
	EmployeeDao ed;
		public EmployeeService() {
		ed = new EmployeeDao();
		}
			public String addEmployee(Employee emp) {
							if(emp.getSalary()>12000) {
											if(ed.storeEmployeeInfo(emp)>0) {
												return "Record stored Successfully";
											}else {
												return "Record not store";
											}
							}else {
								return "Salary must be >12000";
							}
			}
			
			public List<Employee> getEmployeeInfo() {
				/*List<Employee> listOfRec = ed.retrieveAllEmployeeInfo();
				Iterator<Employee> li = listOfRec.iterator();
				while(li.hasNext()) {
					Employee emp = li.next();
					emp.setSalary(emp.getSalary()+500);
				}
				return listOfRec;*/
				return ed.retrieveAllEmployeeInfo().stream().map(e->{e.setSalary(e.getSalary()+500);return e;}).
				collect(Collectors.toList());
				//return ed.retrieveAllEmployeeInfo();
			}
}
