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
		tran.begin();
		Student s1 = new Student();
		Student s2 = new Student();
		int s1Marks[]= {56,78,87,90};
		int s2Marks[]= {67,56,75,89};
		s1.setSid(100); s1.setSname("Ravi");		s1.setMarks(s1Marks);
		s2.setSid(101); s2.setSname("Ramesh");	s2.setMarks(s2Marks);
		session.save(s1);				session.save(s2);
		tran.commit();
		session.close();
		sf.close();
		System.out.println("Record saved successfully.....");
	}

}
