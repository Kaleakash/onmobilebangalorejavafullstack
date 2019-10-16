package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
		/*Employee emp = new Employee();
		emp.display();*/
		Resource res = new ClassPathResource("beans1.xml");
	BeanFactory factory = new XmlBeanFactory(res);
	/*Employee emp4 =(Employee)factory.getBean("emp4");
	//emp.display();
	System.out.println(emp4);
	
	Address add = (Address)factory.getBean("add3");
	System.out.println(add);*/
	//Employee emp5 = (Employee)factory.getBean("emp5");
	//System.out.println(emp5);
	Employee emp1 =(Employee)factory.getBean("emp");
	Employee emp2 =(Employee)factory.getBean("emp");
	
	
	}

}
