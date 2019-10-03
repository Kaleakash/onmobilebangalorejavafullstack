package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DemoTest {

	public static void main(String[] args) {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("OneToOne");
EntityManager manager = emf.createEntityManager();
EntityTransaction tran = manager.getTransaction();
	/*
			Passport pp = new Passport();
			pp.setPpId(123);
			pp.setPassportDesc("Passport Description Details");
			
			Person p = new Person();
			p.setpId(1);
			p.setPersonName("Ravi");
			p.setPp(pp);
			
			tran.begin();
					manager.persist(p);
			tran.commit();
			*/
			Person p = new Person();
			p.setpId(2);
			p.setPersonName("Ramesh");
			
			Passport pp = new Passport();
			pp.setPpId(456);
			pp.setPassportDesc("This is another passport description details");
			pp.setPp(p);
			p.setPp(pp);
			tran.begin();
						manager.persist(pp);
			tran.commit();
			System.out.println("Done!");
	}

}
