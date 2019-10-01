package com;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class DemoTest {

	public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudOperation");
			EntityManager manager  = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			//Insert Record 
			/*
			Employee emp = new Employee();
			emp.setId(111);
			emp.setName("Chinu");
			emp.setSalary(26000);
			
			tran.begin();
			manager.persist(emp);
			tran.commit();
			*/
			//Delete Record 
			/*Employee emp = manager.find(Employee.class, 101);
			if(emp!=null) {
							//System.out.println("Record found");
							tran.begin();
											manager.remove(emp);
							tran.commit();
							System.out.println("Record deleted successfully...");
			}else {
							System.out.println("Record is not available");
			}*/
			//Update the Records 
		/*	Employee emp = manager.find(Employee.class, 104);
			if(emp!=null) {
							//System.out.println("Record found");
							tran.begin();
										emp.setSalary(emp.getSalary()+2000);
										emp.setName("Mr."+emp.getName());
										manager.merge(emp);
							tran.commit();
							System.out.println("Record updated successfully...");
			}else {
							System.out.println("Record is not available");
			}*/
			//Retrieve only one records 
			/*Employee emp = manager.find(Employee.class, 104);
			if(emp!=null) {
				System.out.println("id is "+emp.getId()+" name is "+emp.getName()+" salary "+emp.getSalary());
			}else {
							System.out.println("Record is not available");
			}*/
			//Retirev more than one records using JPQL 
			/*Query qry = manager.createQuery("select e from Employee e ");
			List<Employee> listOfRec = qry.getResultList();
			System.out.println("Number of Records are "+listOfRec.size());
			Iterator<Employee> li = listOfRec.iterator();
			while(li.hasNext()) {
				Employee e = li.next();
				System.out.println(e);
			}*/
			//Retirev more than one records using JPQL with Where clause 
//Query qry = manager.createQuery("select e from Employee e where e.salary>20000");

			//Parametirized Query 
//Query qry = manager.createQuery("select e from Employee e where e.salary>?1 and e.name like ?5");
//qry.setParameter(1, 20000f);
//qry.setParameter(5, "%e%");
			
//Label Query 
/*Query qry = manager.createQuery("select e from Employee e where e.salary>:sal and e.name like :info");
qry.setParameter("sal", 20000f);
qry.setParameter("info", "%e%");
List<Employee> listOfRec = qry.getResultList();
			System.out.println("Number of Records are "+listOfRec.size());
			Iterator<Employee> li = listOfRec.iterator();
			while(li.hasNext()) {
				Employee e = li.next();
				System.out.println(e);
			}
*/
			//Retrieve only one property ie partial objects 
			/*Query qry = manager.createQuery("select e.name from Employee e");
			List<String> list = qry.getResultList();
			Iterator<String> li = list.iterator();
			while(li.hasNext()) {
				String name = li.next();
				System.out.println(name);
			}*/
			
			//Retrieve more than one property ie partial objects 
			/*Query qry = manager.createQuery("select e.name,e.salary from Employee e");
			List<Object[]> list = qry.getResultList();
			Iterator<Object[]> li = list.iterator();
			while(li.hasNext()) {
				Object obj[]=li.next();
				System.out.println("name "+obj[0]+" salary "+obj[1]);
			}*/
			
Query qry = manager.createNativeQuery("select t.tname,t.tech,s.sname from trainer t, "
		+ "student s where t.tid = s.tsid");
List<Object[]> list = qry.getResultList();
Iterator<Object[]> li = list.iterator();
while(li.hasNext()) {
	Object obj[]=li.next();
	System.out.println("trainer name "+obj[0]+" tech "+obj[1]+" student name "+obj[2]);
}		
			manager.close();
			emf.close();
			
	}

}
