package com.spring.standalone.collections;

import java.util.*;

public class Person {
	
	private List<String> friends;
	private Map<String,Object> courseInfo;
	private Properties properties;

	public Map<String, Object> getCourseInfo() {
		return courseInfo;
	}

	public void setCourseInfo(Map<String, Object> courseInfo) {
		this.courseInfo = courseInfo;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", courseInfo=" + courseInfo +  ", properties =" + properties + "]";
	}
	
	
	
	

}
