package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.Employee;
import resource.DbResource;

public class EmployeeDao {

	
	public int storeEmployeeDetails(Employee emp) {
		Integer i = null;
		SessionFactory sf = DbResource.getSessionFactoryInstance();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();
		i= 	(Integer)session.save(emp);
		tran.commit();
		return i;
	}
	
	public List<Employee> getEmployeeDetails() {
		SessionFactory sf = DbResource.getSessionFactoryInstance();
		Session session = sf.openSession();
		Query qry = session.createQuery("from Employee");
		List<Employee> listOfRec = qry.list();
		return listOfRec;
	}
}
