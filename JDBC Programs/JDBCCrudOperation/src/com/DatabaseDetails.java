package com;

import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseDetails {
private static Connection con;
static {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onmobile", "root", "root");
	} catch (Exception e) {
		System.out.println("Database Error "+e);
	}
}
public static Connection getDbConnection() {
					return con;
			}
}


