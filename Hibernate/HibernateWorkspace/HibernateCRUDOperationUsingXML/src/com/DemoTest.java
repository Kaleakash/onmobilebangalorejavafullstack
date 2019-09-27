package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		System.out.println("file loaded successfully....");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		
		Transaction tran =  session.getTransaction();
		
		/* Insert Record 
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Ramesh");
		emp.setSalary(16000);
		tran.begin();
				session.save(emp);
		tran.commit();
		System.out.println("Record stored successfully.....");
		*/
		
		//Delete Record 
		/*Employee emp = (Employee)session.get(Employee.class, 100);
		if(emp!=null) {
			//System.out.println("Record found");
						tran.begin();
											session.delete(emp);
											//session.save(emp);
											//session.update(emp);
												
						tran.commit();
						System.out.println("Record deleted successfully....");
		}else {
			System.out.println("Record not found");
		}*/
		
		//updated Record 
			/*	Employee emp = (Employee)session.get(Employee.class, 101);
				if(emp!=null) {
								tran.begin();
								emp.setSalary(emp.getSalary()+2000);
											session.update(emp);
								tran.commit();
								System.out.println("Record updated successfully....");
				}else {
					System.out.println("Record not found");
				}*/
		//Retrieve only one records 
		Employee emp = (Employee)session.get(Employee.class, 100);
		if(emp!=null) {
		System.out.println("id "+emp.getId()+" name "+emp.getName()+" salary "+emp.getSalary());
		}else {
		System.out.println("Record not found");
		}
	}

}
