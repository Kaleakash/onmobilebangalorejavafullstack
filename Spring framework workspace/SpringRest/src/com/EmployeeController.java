package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//@RestController = @Controller +@ResponseBody
@RestController
public class EmployeeController {

	@RequestMapping(value = "say",
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayHello() {
		return "Welcome to Spring MVC With Rest";
	}
	@RequestMapping(value = "sayHtml",
			produces = MediaType.TEXT_HTML_VALUE)
	public String sayHtml() {
return "<h2>Welcome to Spring MVC With Rest with HTML Message</h2>";
	}
	@RequestMapping(value = "sayXml",
			produces = MediaType.TEXT_XML_VALUE)
	public String sayXml() {
return "<h2>Welcome to Spring MVC With Rest with XML Message</h2>";
	}
	
	@RequestMapping(value = "empXml",
	produces = MediaType.APPLICATION_XML_VALUE)
	public Employee getEmployeeInfoXml() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Ramesh");
		emp.setSalary(15000);
		return emp;
	}
	
	
	@RequestMapping(value = "empJson",
			produces = MediaType.APPLICATION_JSON_VALUE)
			public Employee getEmployeeInfoJson() {
				Employee emp = new Employee();
				emp.setId(100);
				emp.setName("Ramesh");
				emp.setSalary(15000);
				return emp;
			}
	
	
	@RequestMapping(value = "empDetailsJson",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployeeDetails() {
				Employee emp1 = new Employee();
				emp1.setId(100);
				emp1.setName("Ramesh");
				emp1.setSalary(15000);
				
				Employee emp2 = new Employee();
				emp2.setId(101);
				emp2.setName("Ravi");
				emp2.setSalary(18000);
				
				Employee emp3 = new Employee();
				emp3.setId(102);
				emp3.setName("Ramu");
				emp3.setSalary(12000);
		List<Employee> listOfRec = new ArrayList<Employee>();
		listOfRec.add(emp1); 
		listOfRec.add(emp2);
		listOfRec.add(emp3);
				return listOfRec;
			}
	
	@RequestMapping(value = "empDetailsXml",
			produces = MediaType.APPLICATION_XML_VALUE)
	public List<Employee> getEmployeeDetailsXml() {
		System.out.println("I Came Here");		
		Employee emp1 = new Employee();
				emp1.setId(100);
				emp1.setName("Ramesh");
				emp1.setSalary(15000);
				Employee emp2 = new Employee();
				emp2.setId(101);
				emp2.setName("Ravi");
				emp2.setSalary(18000);
				
				Employee emp3 = new Employee();
				emp3.setId(102);
				emp3.setName("Ramu");
				emp3.setSalary(12000);
		List<Employee> listOfRec = new ArrayList<Employee>();
		listOfRec.add(emp1); 
		listOfRec.add(emp2);
		listOfRec.add(emp3);
				return listOfRec;
			}
	
//Query param 
	//passQuery?id=100&name=Ravi&salary=16000
	@RequestMapping(value="passQuery",
	produces = MediaType.TEXT_PLAIN_VALUE)
	public String passQueryParam(@RequestParam("id") int id, 
		@RequestParam("name")	String name, 
		@RequestParam("salary") float salary) {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
		return "Welcome "+name;
	}
	
	//Path param 
		//passPath/100/Ajay/15000
		@RequestMapping(value="passPath/{id}/{name}/{salary}",
		produces = MediaType.TEXT_PLAIN_VALUE)
		public String passPathParam(@PathVariable("id") int id, 
				@PathVariable("name")	String name, 
				@PathVariable("salary") float salary) {
			System.out.println("id is "+id);
			System.out.println("name is "+name);
			System.out.println("salary is "+salary);
			return "Welcome "+name;
		}
		
	@RequestMapping(value="empObject",
	method = RequestMethod.POST,
	consumes = MediaType.APPLICATION_JSON_VALUE,
	produces = MediaType.TEXT_PLAIN_VALUE)	
	public String passEmpObject(@RequestBody Employee emp) {
		System.out.println("id is "+emp.getId());
		System.out.println("name is "+emp.getName());
		System.out.println("salary is "+emp.getSalary());
		return "Welcome "+emp.getName();
	}	
		
	@RequestMapping(value ="updateEmployee",
	method = RequestMethod.PUT,
	consumes = MediaType.APPLICATION_JSON_VALUE,
	produces =  MediaType.APPLICATION_XML_VALUE
	)
public Employee updateEmployeeDetails(@RequestBody Employee emp) {
		emp.setSalary(emp.getSalary()+2000);
		emp.setName("Mr"+emp.getName());
		return emp;
	}
	
	@RequestMapping(value ="deleteEmployee/{empId}",
			method = RequestMethod.DELETE)
	public String deleteEmpDetails(@PathVariable("empId") int id) {
		return "Employee details with id "+id+"deleted ";
	}
}
