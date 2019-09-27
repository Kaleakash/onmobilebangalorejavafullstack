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
		Transaction tran= session.getTransaction();
		
		CompanyProjectId cpi = new CompanyProjectId();
		cpi.setCmpId(100); cpi.setProjectid(1);
		
		
		CompanyProjectInfo cp = new CompanyProjectInfo();
		cp.setCpid(cpi);
		cp.setPrice(15000);
		
		tran.begin();
						session.save(cp);
		tran.commit();
		session.close();
		sf.close();
		
	}

}
