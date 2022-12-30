package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/stereotype/stereo.xml");
		
		//Student s = context.getBean("student",Student.class);
		Student s = context.getBean("ob",Student.class);
		
		
		
		System.out.println(s);
		System.out.println(s.getAddresses());
		System.out.println(s.getAddresses().getClass().getName());
		System.out.println("------------------------------------");
		System.out.println(s.getCourseMap());
		System.out.println(s.getCourseMap().getClass().getName());
	}

}
