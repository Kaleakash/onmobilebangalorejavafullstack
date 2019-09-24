package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DemoTest1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onmobile", "root", "root");
		con.setAutoCommit(false);		//Enable to Transaction 
		
		Statement stmt = con.createStatement();
		int res1 = stmt.executeUpdate("update account set amount = amount -500 where accno =1");
		int res2 = stmt.executeUpdate("update account set amount = amount+500 where accno = 2");
		if(res1>0 && res2>0) {
			System.out.println("Amount transfer successfully");
			con.commit();
		}else {
			System.out.println("Amount is not transfer");
			con.rollback();
		}
	}

}
