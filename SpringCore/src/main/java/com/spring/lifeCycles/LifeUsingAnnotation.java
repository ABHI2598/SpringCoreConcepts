package com.spring.lifeCycles;

import javax.annotation.*;

public class LifeUsingAnnotation {
	private String courses;

	public LifeUsingAnnotation(String courses) {
		super();
		this.courses = courses;
	}

	public LifeUsingAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Annotation [courses=" + courses + "]";
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Calling out inti method using Annotation");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Calling out destroy method using annotation");
	}
	

}
