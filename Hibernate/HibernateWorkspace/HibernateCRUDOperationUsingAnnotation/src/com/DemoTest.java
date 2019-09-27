package com;

import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		
		con.addAnnotatedClass(Employee.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		/*Employee emp  = new Employee();
		emp.setId(109);
		emp.setName("Mahesh");
		emp.setSalary(32000);
		tran.begin();
				session.save(emp);
		tran.commit();
		session.close();
		sf.close();
		System.out.println("Stored successfully..");*/
		
		//Retrieve more than one records 
		/*	Query	qry = session.createQuery("select e from Employee e");
				List<Employee> listOfRec	 = qry.list();
				System.out.println("Number of records "+listOfRec.size());
				ListIterator<Employee> li = listOfRec.listIterator();
				while(li.hasNext()) {
					Employee emp = li.next();
					System.out.println(emp.getId()+" - "+emp.getName()+" "+emp.getSalary());
				}*/
		//Retrieve more than one records with where clause 
		//Query	qry = session.createQuery("from Employee");
		//Query	qry = session.createQuery("from Employee e where e.salary > 18000");
		//Query	qry = session.createQuery("from Employee e where e.salary > ?");
		//qry.setParameter(0, 18000f);
		/*Query	qry = session.createQuery("from Employee e where e.salary > :sal");
				qry.setParameter("sal", 18000f);
				List<Employee> listOfRec	 = qry.list();
				System.out.println("Number of records "+listOfRec.size());
				ListIterator<Employee> li = listOfRec.listIterator();
				while(li.hasNext()) {
					Employee emp = li.next();
					System.out.println(emp.getId()+" - "+emp.getName()+" "+emp.getSalary());
				}*/
		//Retireve only one property 
		/*Query qry = session.createQuery("select e.id from Employee e");
		List<Integer> ll = qry.list();
		for(int obj : ll) {
			System.out.println(obj);
		}*/
		//Retrieve more than one property 
		/*Query qry = session.createQuery("select e.name,e.salary from Employee e");
		List<?> ll = qry.list();
		ListIterator<?> listOfRec = ll.listIterator();
		while(listOfRec.hasNext()) {
				Object obj[]		= (Object[])listOfRec.next();
				System.out.println("Name is "+obj[0]+" Salary is "+obj[1]);
		}*/
		//Retrieve records using SQL 
		
/*Query qry =session.createSQLQuery("select e.first_name,e.salary,d.department_name from employees e, departments d where e.department_id = d.department_id");
List<?> ll = qry.list();
ListIterator<?> listOfRec = ll.listIterator();
while(listOfRec.hasNext()) {
	Object obj[]		= (Object[])listOfRec.next();
	System.out.println("Name is "+obj[0]+" Salary is "+obj[1] +" Dept Name "+obj[2]);
}*/
		//Update using HQL 
		
		Query qry  = session.createQuery("update Employee e set e.salary = 45000 where e.id = 1001");
		tran.begin();
		int res = qry.executeUpdate();
		tran.commit();
		if(res>0) {
			System.out.println("Record updated successfully....");
		}else {
			System.out.println("Record not found");
		}
	}

}
