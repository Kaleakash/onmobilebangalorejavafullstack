package com;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	DataSource ds;				//JNDI Loook up 
	public int storeEmployeeInfo(int id, 
			String name, 
			float salary) {
		try {
	Connection con = ds.getConnection();
	PreparedStatement pstmt = 
	con.prepareStatement("insert into employee values(?,?,?)");
	pstmt.setInt(1, id);
	pstmt.setString(2, name);
	pstmt.setFloat(3, salary);
	int res = pstmt.executeUpdate();
	return res;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

}
