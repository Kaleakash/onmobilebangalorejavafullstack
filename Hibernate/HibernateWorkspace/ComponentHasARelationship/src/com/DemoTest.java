package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran  = session.getTransaction();
		
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Ravi");
		Address add = new Address();
		add.setCity("Bangalore");
		add.setState("Kar");
		emp.setAdd(add);
		tran.begin();
										session.save(emp);
		tran.commit();
		session.close();
		sf.close();
		System.out.println("Record saved.. ");
	}

}
