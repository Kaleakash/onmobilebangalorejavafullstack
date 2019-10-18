package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDao {

	@Autowired
	JdbcTemplate jt;
	/*DataSource 
	 * 	JdbcTemplate 
	 * SessionFactory 
	 * EntityManager 
	 * 	HibernateTemplate
	 * 	JpaTemplate 
	 * 
	 */
	
	
	public int checkUser(Login ll) {
List obj = jt.queryForList("select * from login where user like ? and pass like ?", new Object[] {ll.getUser(),ll.getPass()});
return obj.size();
	}
}
