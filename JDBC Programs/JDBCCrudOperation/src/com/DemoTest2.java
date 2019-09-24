package com;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;



public class DemoTest2 {

	public static void main(String[] args) throws Exception{
		Connection con = DatabaseDetails.getDbConnection();
		DatabaseMetaData dmd = con.getMetaData();
		System.out.println(dmd.getDatabaseMajorVersion());
		System.out.println(dmd.getDriverName());
		//System.out.println(dmd.getDatabaseProductName());
		System.out.println(dmd.getURL());
		System.out.println(dmd.getUserName());
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from employees");
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("Number of columns "+rsmd.getColumnCount());
		for(int i=1;i<=rsmd.getColumnCount();i++) {
	System.out.println("Column Name "+rsmd.getColumnName(i)+" "
			+ "Data types "+rsmd.getColumnTypeName(i));
	
		}
	}

}
