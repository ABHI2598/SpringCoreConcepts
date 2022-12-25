package com.spring.lifeCycles;

public class lifeCycleUsingXml {
	
	private String price;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public lifeCycleUsingXml(String price) {
		super();
		this.price = price;
	}
	
	public lifeCycleUsingXml() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Xml [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("INSIDE INIT METHOD USING XML");
	}
	
	public void destroy() {
		System.out.println("INSIDE DESTROY USING XML ");
	}

	
	
	

}
