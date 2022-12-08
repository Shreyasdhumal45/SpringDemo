package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyCheck {

	public static void main(String[] args) {
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("appcontext2.xml");
		
	  Employee emp=	(Employee) apc.getBean("e");
		System.out.println(emp);
	}
}
