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
		Transaction tran = session.getTransaction();
		
		Manager mgr1 = new Manager();
		mgr1.setId(100); mgr1.setName("Ravi"); mgr1.setSalary(45000); mgr1.setNumberOfEmp(5);
		
		Programmer pr1 = new Programmer();
		pr1.setId(101); pr1.setName("Ajay");pr1.setSalary(12000); pr1.setProjectName("Java");
		
		tran.begin();
					session.save(mgr1);
					session.save(pr1);
		tran.commit();
		session.close();
		sf.close();
		System.out.println("Record saved successfully....");
	}

}
