package com.spring.autowiring.usingAnnotation;

import org.springframework.beans.factory.annotation.*;

public class Employee1 {
	   @Autowired
	   @Qualifier("address2")
       private Address address;

	public Address getAddress() {
		return address;
	}

	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	//@Autowired
	public Employee1(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
}
