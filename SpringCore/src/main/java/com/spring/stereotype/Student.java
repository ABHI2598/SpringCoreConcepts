package com.spring.stereotype;

import java.util.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
@Component("ob")
public class Student {
	@Value("Abhinav Pandey")
	private String name;
	
	@Value("Kalyan")
	private String city;
	
	@Value("#{listId}")
	private List<String> addresses;
	
	@Value("#{fees}")
	private Map<String,Integer> courseMap;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String,Integer> getCourseMap() {
		return courseMap;
	}
	public void setCourseMap(Map<String,Integer> courseMap) {
		this.courseMap = courseMap;
	}
	
	

}
