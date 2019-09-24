package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class DemoTest {
	public static void main(String[] args) {
		int res[]= new int[10];
		try {
			//1st Load the Driver type 4 for MySQL
			Class.forName("com.mysql.jdbc.Driver");
			//Driver dd = new com.mysql.jdbc.Driver();
			//DriverManager.registerDriver(dd);
			System.out.println("Driver Loaded Successfully.....");
			//Driver type 4 for Oracle 
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//Driver dd = new oracle.jdbc.driver.OracleDriver();
			//DriverManager.registerDriver(dd);
			//System.out.println("Driver Loaded successfully....");
	
	Connection	con = 	DriverManager.getConnection("jdbc:mysql://localhost:3306/onmobile", "root", "root");
	CallableStatement cstmt = con.prepareCall("{call empDeptDetails(?,?)}");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the employee id ");
	int id = sc.nextInt();
	cstmt.setInt(1, id);
	cstmt.registerOutParameter(2, Types.VARCHAR);		// register for out parameter 
	cstmt.execute();
	System.out.println("Department Name is "+cstmt.getString(2));
	
	Statement stmt = con.createStatement();
	stmt.addBatch("");
	

	
	
	/*
	CallableStatement cstmt = con.prepareCall("{call storeData(?,?,?)}");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the id");
	int id = sc.nextInt();
	System.out.println("Enter the name");	
	String name = sc.next();
	System.out.println("Enter the salary ");
	float salary = sc.nextFloat();
	cstmt.setInt(1, id);
	cstmt.setString(2, name);
	cstmt.setFloat(3, salary);
	int result= cstmt.executeUpdate();
	System.out.println(result);*/
	/*
	Statement stmt  = con.createStatement();
	
								stmt.addBatch("insert into emp values(222,'Mahesh',18000)");
								stmt.addBatch("insert into emp values(233,'Mahesh',18000)");
								stmt.addBatch("insert into emp values(134,'Mahesh',18000)");
								stmt.addBatch("insert into emp values(245,'Mahesh',18000)");
								
						res = stmt.executeBatch();
								System.out.println("Number of records inserted "+res.length);
	
	/*System.out.println("Connected successfully...");
	Statement stmt = con.createStatement();
	PreparedStatement pstmt = con.prepareStatement("insert into emp(name,salary) values(?,?)");
	System.out.println("Statement created...");
	//Insert query 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the id");
	int id = sc.nextInt();
	System.out.println("Enter the name");	
	String name = sc.next();
	System.out.println("Enter the salary ");
	float salary = sc.nextFloat();
	pstmt.setString(1, name);
	pstmt.setFloat(2, salary);
	int res = pstmt.executeUpdate();
	int res1 = stmt.executeUpdate("insert into emp values("+id+",' "+name+" ',"+salary+")");
	int res2 = stmt.executeUpdate("delete from emp where id = 1");
	//System.out.println(" "+res);
	if(res>0) {
		System.out.println("Record inserted....");
	}
	
	//Delete query 
	/*	int res = stmt.executeUpdate("delete from emp where id =1");
		if(res>0) {
			System.out.println("Record deleted....");
		}else {
			System.out.println("Record not found");
		}
	*/
	//update Query 
	
	/*
	int res = stmt.executeUpdate("update emp set salary = salary + 1000 where id = 1");
	if(res>0) {
		System.out.println("Record updated....");
	}else {
		System.out.println("Record not found");
	}
	*/
	
	//Select clause query 
	/*ResultSet rs = stmt.executeQuery("select * from employees  where salary > 15000");
	/*rs.next();
	System.out.println("id is "+rs.getInt("employee_id"));
	System.out.println("Name is "+rs.getString(2));
	//close the resources x
		System.out.println("id is "+rs.getInt("employee_id"));
		System.out.println("Name is "+rs.getString(2));
	}
	*/
	
	
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(res[0]);
			System.out.println(res[1]);
			System.out.println(res[2]);
			System.out.println(res[3]);
		}
	}
}
