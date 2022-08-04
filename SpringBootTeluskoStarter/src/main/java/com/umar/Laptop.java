package com.umar;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {

	private int laptopId;
	private String laptopBrand;
	
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopBrand() {
		return laptopBrand;
	}
	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}
	
	public void compile() {
		System.out.println("Laptop's method compiling...");
	}
	
}
