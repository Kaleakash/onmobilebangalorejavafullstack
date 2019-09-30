package com;

import java.util.ArrayList;
import java.util.List;

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
	/*
	Student s1 = new Student();
	s1.setSid(100); s1.setSname("Meeta");s1.setAge(28); s1.setTsid(2);
	
	Student s2 = new Student();
	s2.setSid(101); s2.setSname("Keeta");s2.setAge(26); s2.setTsid(2);
	
	List<Student> listOfStd = new ArrayList<Student>();
	listOfStd.add(s1); listOfStd.add(s2);
	
	Trainer t1 = new Trainer();
	t1.setTid(2);		t1.setTname("Raju"); t1.setTech(".net"); t1.setListOfStd(listOfStd);
	
	tran.begin();
						session.save(t1);
						//session.save(s1);
						//session.save(s2);
	tran.commit();
	System.out.println("Record saved successfully......");
	*/
	
	//Delete Operations 
	Trainer t = (Trainer)session.get(Trainer.class, 2);
	if(t!=null) {
				System.out.println(t.getTname());
				//System.out.println(t.getListOfStd());
	}else {
		System.out.println("Trainer is not present");
	}
	session.close();
	sf.close();
	
	}

}
