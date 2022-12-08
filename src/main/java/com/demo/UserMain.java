package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {
	public static void main(String[] args) {
		
	
ApplicationContext con=new ClassPathXmlApplicationContext("appcontext.xml");
	  User us=  (User) con.getBean("sd");
	
	System.out.println(us);
	
	}
}