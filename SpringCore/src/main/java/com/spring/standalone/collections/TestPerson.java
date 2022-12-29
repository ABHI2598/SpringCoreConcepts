package com.spring.standalone.collections;

import com.spring.standalone.collections.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
	
	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/standalone/collections/standaloneConfig.xml");

		Person p = context.getBean("person", Person.class);

		System.out.println(p.getFriends());
		System.out.println(p.getFriends().getClass().getName());
		System.out.println("-----------------------------------------------");
	    System.out.println(p.getCourseInfo()); 
		System.out.println(p.getCourseInfo().getClass().getName());
		System.out.println("-----------------------------------------------");
		System.out.println(p.getProperties());
		System.out.println(p.getProperties().getClass().getName());

	}

}
