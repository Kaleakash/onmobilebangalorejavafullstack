package com;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cache;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityManagerFactory emf = Persistence.createEntityManagerFactory("ManyToManyRelationship");
EntityManager manager = emf.createEntityManager();
EntityTransaction tran = manager.getTransaction();
/*Courses c1 = new Courses();
c1.setCid(3); c1.setCourseName("HTML5/CSS3");

Courses c2 = new Courses();
c2.setCid(4); c2.setCourseName("Angular");

List<Courses> listOfCrs = new ArrayList<Courses>();
listOfCrs.add(c1); listOfCrs.add(c2);
Students s1 = new Students();
s1.setSid(101);
s1.setStudentName("Ramesh");
s1.setListOfCrs(listOfCrs);
				tran.begin();
							manager.persist(s1);
				tran.commit();
				System.out.println("Record saved successfully...");
				*/
//Retrieve Student and Course details through Student objects. 
Students ss = manager.find(Students.class, 101);
if(ss!=null) {
				System.out.println("Student details");
				System.out.println("Name of the student "+ss.getStudentName());
				List<Courses> cc = ss.getListOfCrs();
				for(Courses c:cc) {
					System.out.println("Course name is "+c.getCourseName());
				}
}else {
	System.out.println("No Student details available");
}
		manager.close();
		//emf.close();
			Cache cc	= emf.getCache();
System.out.println("Object available"+cc.contains(Students.class, 101));

	}

}
