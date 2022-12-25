package com.spring.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main( String[] args )
    {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/CI/ciConfig.xml");
		ConstructorInjectionEx person1 = (ConstructorInjectionEx) context.getBean("person");
		
		System.out.println(person1);
    }
}
