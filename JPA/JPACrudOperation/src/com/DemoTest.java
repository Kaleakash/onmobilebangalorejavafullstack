package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DemoTest {

	public static void main(String[] args) {
		
		
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudOperation");
			EntityManager manager  = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			
			Employee emp = new Employee();
			emp.setId(111);
			emp.setName("Chinu");
			emp.setSalary(26000);
			
			tran.begin();
			manager.persist(emp);
			tran.commit();
			manager.close();
			emf.close();
			
	}

}
