package com.spring.autowiring.usingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         @SuppressWarnings("resource")
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/spring/autowiring/usingxml/autoConfig.xml");
         
         Employee em = context.getBean("emp",Employee.class);
         
         System.out.println(em);
	}

}
