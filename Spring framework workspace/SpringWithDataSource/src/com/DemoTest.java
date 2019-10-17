package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
EmployeeDao ed = (EmployeeDao)ac.getBean("employeeDao");
int res = ed.storeEmployeeInfo(100, "Ravi", 16000);
if(res>0) {
	System.out.println("REcord stored");
}else {
	System.out.println("REcord not store");
}
	}

}
