package com.umar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Alien {
	
	@Id
	@Column(name = "A_ID", nullable = false)
	@GeneratedValue
	private int aid;
	
	@Column(name = "A_NAME", nullable = false)
	private String aname;
	private String tech;
	
	public Alien() {
		
	}
	
	
	public Alien(Alien a) {
		aid = a.aid;
		aname = a.aname;
		tech = a.tech;
	}
	public int getaid() {
		return aid;
	}
	public void setaid(int aId) {
		this.aid = aId;
	}
	public String getaname() {
		return aname;
	}
	public void setaname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
	}
	
	
	
	

}