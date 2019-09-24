package main;

import java.util.List;
import java.util.Scanner;

import bean.Employee;
import service.EmployeeService;

public class MainDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String con = null;
		EmployeeService es = new EmployeeService();
		int id;
		String name;
		float salary;
		do {
				System.out.println("1:Add Employee");
				System.out.println("2:Retrieve All Employee");
				System.out.println("Enter your choice");
				int ch = sc.nextInt();
				switch(ch) {
				case 1:System.out.println("Enter the id");
				           id = sc.nextInt();
				           System.out.println("Enter the name");
				           name = sc.next();
				           System.out.println("Enter the salary");
				           salary = sc.nextFloat();
				           Employee emp = new Employee();
				           emp.setId(id); emp.setName(name); emp.setSalary(salary);
				           System.out.println(es.addEmployee(emp));
							break;
				case 2:List<Employee> listOfEmp = es.getEmployeeInfo();
							for(Employee empRef : listOfEmp) {
								System.out.println(empRef);
							}
							break;
				default :System.out.println("Wrong choice");
				}
				System.out.println("Do you want to continue?");
				con = sc.next();
		} while (con.equalsIgnoreCase("y"));

	}

}
