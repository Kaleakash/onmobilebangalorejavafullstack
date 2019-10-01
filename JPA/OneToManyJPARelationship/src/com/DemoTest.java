package com;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityManagerFactory emf = Persistence.createEntityManagerFactory("OneToManyJPARelationship");
EntityManager manager = emf.createEntityManager();
EntityTransaction tran = manager.getTransaction();

Employees emp1 = new Employees();
emp1.setEmpid(1);emp1.setEmpname("Raj"); emp1.setSalary(16000); 
//emp1.setPeid(101);

Employees emp2 = new Employees();
emp2.setEmpid(2);emp2.setEmpname("Ram");   emp2.setSalary(18000);
//emp2.setPeid(101);

Employees emp3 = new Employees();
emp3.setEmpid(3);emp3.setEmpname("Ramesh"); emp3.setSalary(12000); 
//emp3.setPeid(101);

Employees emp4 = new Employees();
emp4.setEmpid(4);emp4.setEmpname("Ravi");   emp4.setSalary(18000);
//emp4.setPeid(101);

List<Employees> listOfEmp1 = new ArrayList<Employees>();
listOfEmp1.add(emp1); listOfEmp1.add(emp2);


List<Employees> listOfEmp2 = new ArrayList<Employees>();
listOfEmp2.add(emp3); listOfEmp2.add(emp4);


Projects pp1 = new Projects();
pp1.setTypeOfProject("Angular");
pp1.setListOfEmp(listOfEmp1);


Projects pp2 = new Projects();
pp2.setTypeOfProject("Java");
pp2.setListOfEmp(listOfEmp2);

tran.begin();
			manager.persist(pp1);	
			manager.persist(pp2);	
			//manager.persist(emp1);
			//manager.persist(emp2);

tran.commit();
System.out.println("Stored successfully...");
	}

}
