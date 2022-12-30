package com.spring.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/spel/demo.xml");
		
		
		Demo d = context.getBean("demo", Demo.class);
	    System.out.println(d);
	}

}
