package service;

import bean.Employee;

public class EmployeeService {
		Employee empRecords[] = new Employee[10];
		int count=0;
		public String storeEmployeeInfo(Employee emp) {
								for(int i=0;i<count;i++) {
									Employee e = empRecords[count];
									if(e.getId()==emp.getId()) {
										return "Employee Id must be unique";
									}
									break;
								}
								empRecords[count]=emp;
								count++;
			
			return null;
		}
}
