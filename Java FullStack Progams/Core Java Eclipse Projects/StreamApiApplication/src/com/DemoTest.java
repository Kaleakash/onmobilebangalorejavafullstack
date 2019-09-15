package com;

import java.util.ArrayList;
import java.util.List;

public class DemoTest {
	public static void main(String[] args) {
	List<Employee> listOfRec = new ArrayList<Employee>();
	listOfRec.add(new Employee(1, "Ravi", 16000));
	listOfRec.add(new Employee(4, "Ramesh", 12000));
	listOfRec.add(new Employee(2, "Rajesh", 14000));
	listOfRec.add(new Employee(3, "Vijay", 18000));
	listOfRec.add(new Employee(5, "Mahesh", 20000));
	
	
	/*System.out.println("All Employee Records ");
	listOfRec.stream().forEach(emp->System.out.println(emp));
	System.out.println("All Employee Records  with Salary 5000 as bonus");
	listOfRec.stream().map(emp->emp.getSalary()+5000).forEach(emp->System.out.println(emp));
	
	
	System.out.println("All Employee Records  with Salary 5000 as bonus with All Records ");
	listOfRec.stream().map(emp->emp.getSalary()+5000).forEach(emp->System.out.println(emp));
	
	
	System.out.println("Filter the Records with Condition > 150000");
	listOfRec.stream().filter(emp->emp.getSalary()>15000).forEach(emp->System.out.println(emp));

	long numberOfRec = listOfRec.stream().count();
	System.out.println("Total Number of Records "+numberOfRec);
	*/
	//long numberOfRec1 = listOfRec.stream().filter(emp->emp.getSalary()>15000).count();
	
	//System.out.println("Number of records with Salary   "+numberOfRec1);
	//listOfRec.stream().filter(emp->emp.getSalary()>15000).forEach(emp->System.out.println(emp));
	double sumOfSalary  = listOfRec.stream().map(emp->emp.getSalary()).mapToDouble(i->i).sum();
	System.out.println("Total sum salary is "+sumOfSalary);
		}

}


