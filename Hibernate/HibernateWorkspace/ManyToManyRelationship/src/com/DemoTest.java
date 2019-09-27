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
	Session  session = sf.openSession();
	Transaction tran = session.getTransaction();
	
	TechnologiesDetails t1 = new TechnologiesDetails();
	t1.setTechId(1);
	t1.setTechName("Java");
	
	
	
	TechnologiesDetails t2 = new TechnologiesDetails();
	t2.setTechId(2);
	t2.setTechName(".net");
	
	TechnologiesDetails t3 = new TechnologiesDetails();
	t3.setTechId(3);
	t3.setTechName("Angular");
	
	List<TechnologiesDetails> listOfRecByStd1 = new ArrayList<TechnologiesDetails>();
	listOfRecByStd1.add(t1);listOfRecByStd1.add(t2);listOfRecByStd1.add(t3);
	
	
	EmployeeDetails emp1 = new EmployeeDetails();
	emp1.setEmpId(100);   emp1.setName("Raj"); emp1.setListOfTech(listOfRecByStd1);
	
	tran.begin();
		session.save(emp1);
	tran.commit();
	session.close();
	sf.close();
	System.out.println("done!");
	}

}
