package com.spring.lifeCycles;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeUsinfInterfaces implements InitializingBean, DisposableBean{
     private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LifeUsinfInterfaces() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LifeUsinfInterfaces(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Interface [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("calling init method for interfaces ");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside destroying method for interfaces");
	}
     
	
     
}
