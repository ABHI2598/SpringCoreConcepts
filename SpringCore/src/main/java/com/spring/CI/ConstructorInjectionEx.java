package com.spring.CI;

public class ConstructorInjectionEx {
       
	private String name;
	private int id;
	private Certificate certi;
	
	public ConstructorInjectionEx(String name, int id,Certificate certi) {
		super();
		this.name = name;
		this.id = id;
		this.certi = certi;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " : " + this.id  + " { " + this.certi.serialNo +" : " + this.certi.name +"}";
	}
	
	
	
}
