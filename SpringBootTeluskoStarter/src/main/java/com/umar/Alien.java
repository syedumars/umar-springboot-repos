package com.umar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	private int aId;
	private String aName;
	
	@Autowired
	@Qualifier(value = "lap1")
	private Laptop lappy;
	
	public Laptop getLappy() {
		return lappy;
	}
	
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	
	public Alien() {
		super();
		System.out.println("Constructor called during Alien Object creation");
		
	}
	
	
	public String show() {
		System.out.println("Alien Show method called...");
		lappy.compile();
		return "Show method worked in Alien Class ;)";
	}
	
	@Override
	public String toString() {
		return "Alien [aId=" + aId + ", aName=" + aName + "]";
	}
	
	
	

}
