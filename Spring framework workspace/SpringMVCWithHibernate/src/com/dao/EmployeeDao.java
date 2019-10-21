package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	SessionFactory sf;
	
	public List<Employee> getEmployeeDetails() {
		Session session = sf.openSession();
		Query qry = session.createQuery("from Employee");
		List<Employee> listOfRec = qry.list();
		return listOfRec;
	}
}
