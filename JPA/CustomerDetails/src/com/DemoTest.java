package com;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DemoTest {

	public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("CustomerDetails");
	EntityManager manager = emf.createEntityManager();
	EntityTransaction tran = manager.getTransaction();
	tran.begin();
	Customer c = new Customer();
	c.setCustId(1);
	c.setName("Ravi");
	LocalDateTime ll = LocalDateTime.now();
	c.setDob(ll);
	tran.commit();
	System.out.println("Stored");

	}

}
