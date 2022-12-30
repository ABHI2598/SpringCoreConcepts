package com.spring.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope("prototype")
public class Demo {
	
	@Value("#{11+22}")
	private int x;
	
	//Passing Static Method (T(class).method(param))
	
	@Value("#{ T(java.lang.Math).sqrt(25) }")
	private int y;
	
	//Passing variable (T(class).variable )
	
	@Value("#{ T(java.lang.Math).E }")
	private double z;
	
	//Passing / creating new Object (new Object(value) )
	
    @Value("#{ new java.lang.String('Abhinav Pandey') }")
	private String name;
	
    //Passing boolean expressions only that evaluates to boolean only
    
    @Value("#{ True }")
	private boolean isActive;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + ", isActive=" + isActive + "]";
	}

}
