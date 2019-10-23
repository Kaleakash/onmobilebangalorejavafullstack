package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
	
AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext();
acac.refresh();
acac.scan("com");
Employee emp =(Employee)acac.getBean("employee");
emp.display();
	}

}
