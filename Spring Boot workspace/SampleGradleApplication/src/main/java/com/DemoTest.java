package com;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded successfully");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
