package com.spring.lifeCycles;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 
{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lifeCycles/lifeConfig.xml");
        
		//to invoke destroy method we need to call registerShutdownHook method
		
		context.registerShutdownHook();
		
		//Life Cycle using XML
		lifeCycleUsingXml x = (lifeCycleUsingXml) context.getBean("x1");
		System.out.println(x);
		
		
		//LifeCycle Using Interfaces
		LifeUsinfInterfaces in = (LifeUsinfInterfaces) context.getBean("Inter");
		System.out.println(in);
		
		
		LifeUsingAnnotation at = (LifeUsingAnnotation) context.getBean("annot");
		System.out.println(at);
	}
}
