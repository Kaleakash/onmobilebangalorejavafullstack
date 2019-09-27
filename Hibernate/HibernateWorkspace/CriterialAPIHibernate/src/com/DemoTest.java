package com;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class DemoTest {

	public static void main(String[] args) {
	Configuration con = new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory sf = con.buildSessionFactory();
	Session session = sf.openSession();
	//Retrieve all records using Criteria API 
	/*	Criteria cr = session.createCriteria(Emp.class);
		List<Emp>	ll	= cr.list();
		Iterator<Emp> ii = ll.iterator();
		while(ii.hasNext()) {
			Emp e = ii.next();
			System.out.println(e);
		}*/
	
	//Retrieve records using Criteria API with where clause 
	/*Criteria cr = session.createCriteria(Emp.class);
	//Criterion crt		= Restrictions.gt("salary", 15000f);	
	Criterion crt = 
	Restrictions.and(Restrictions.gt("salary", 15000f), Restrictions.like("name", "%ee%"));
		cr.add(crt);
			List<Emp>	ll	= cr.list();
			Iterator<Emp> ii = ll.iterator();
			while(ii.hasNext()) {
				Emp e = ii.next();
				System.out.println(e);
			}*/
	//Retrieve partial object using Criteria API 
	//Criteria cr = session.createCriteria(Emp.class);
	//Criterion crt = Restrictions.and(Restrictions.gt("salary", 15000f), Restrictions.like("name", "%ee%"));
	//cr.add(crt);
	/*cr.setProjection(Projections.property("name"));
	List<String> ll = cr.list();
	Iterator<String> ii = ll.iterator();
	while(ii.hasNext()) {
		String name= ii.next();
		System.out.println(name);
	}*/
	Criteria cr = session.createCriteria(Emp.class);
	
	Criterion crt = Restrictions.and(Restrictions.gt("salary", 15000f), Restrictions.like("name", "%ee%"));
	cr.add(crt);
	
		Projection p1= Projections.property("id");
		Projection p2 = Projections.property("name");
		ProjectionList ll = Projections.projectionList();
		ll.add(p1);
		ll.add(p2);
		cr.setProjection(ll);
		List<?> obj = cr.list();
		Iterator<?> ii = obj.iterator();
		while(ii.hasNext()) {
			Object obj1[]=(Object[])ii.next();
			System.out.println(" id "+obj1[0]+" name "+obj1[1]);
		}
	session.close();
	sf.close();
	}

}
