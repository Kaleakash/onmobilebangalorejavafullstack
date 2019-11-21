package com;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDao {

	@Autowired
	EntityManagerFactory emf;
	
	public int checkUser(Login ll) {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select ll from Login ll where ll.userId like ?1 and ll.pass like ?2");
		qry.setParameter(1, ll.getUserId());
		qry.setParameter(2, ll.getPass());
		List<Login> list = qry.getResultList();
		return list.size();
	}
}
