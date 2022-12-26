package com.spring.autowiring.usingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/autowiring/usingAnnotation/autoConfig.xml");

		Employee1 em = context.getBean("emp1", Employee1.class);

		System.out.println(em);
	}

}
