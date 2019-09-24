package com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoTest4 {

	public static void main(String[] args) throws Exception{
		Connection con = DatabaseDetails.getDbConnection();
		Statement stmt = con.createStatement(0,ResultSet.TYPE_FORWARD_ONLY);
		ResultSet rs = stmt.executeQuery("select  * from employees where salary > 15000");
		while(rs.next()) {
			System.out.println("id is "+rs.getInt(1)+" Name "+rs.getString(2)+" Salary "+rs.getFloat(8));
		}
		//rs.last();
		System.out.println("Backward direction");
		while(rs.previous()) {
			System.out.println("id is "+rs.getInt(1)+" Name "+rs.getString(2)+" Salary "+rs.getFloat(8));
		}
	}

}
