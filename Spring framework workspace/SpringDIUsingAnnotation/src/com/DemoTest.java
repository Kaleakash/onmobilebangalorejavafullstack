package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoTest {

	public static void main(String[] args) {
	
AnnotationConfigApplicationContext ac = 
new AnnotationConfigApplicationContext();
ac.scan("com");
ac.refresh();
Employee emp = (Employee)ac.getBean("employee");
System.out.println(emp);



/*		
AnnotationConfigApplicationContext ac = 
new AnnotationConfigApplicationContext(ConfigurationDetails.class);
Location ll = (Location)ac.getBean("ll1");
System.out.println(ll);

	//ApplicationContext ac = new ClassPathXmlApplicationContext();

		
	/*ApplicationContext ac = 
	new ClassPathXmlApplicationContext("beans.xml");
	
	Employee emp = (Employee)ac.getBean("employee");
	System.out.println(emp);
	
	
	/*BeanFactory factory = 
	new XmlBeanFactory(new ClassPathResource("beans.xml"));
	Employee emp = (Employee)factory.getBean("employee");
	
	System.out.println(emp);
	/*Address add = (Address)factory.getBean("address");
	System.out.println(add);*/
	}

}
