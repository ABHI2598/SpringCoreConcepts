package com.Springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Springcore.Collections.Emp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        Student s1 = (Student) context.getBean("student");
//        Student s2 = (Student) context.getBean("student1");
//        Student s3 = (Student) context.getBean("student2");
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

		Emp emp1 = (Emp) context.getBean("emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getProps());
        
    }
}
