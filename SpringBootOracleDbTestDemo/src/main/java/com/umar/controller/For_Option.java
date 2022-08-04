package com.umar.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "FOR_OPTION")
public class For_Option {

	@Id
	Integer option_id;
	String option_code;
	@Column(name = "option_order_spec_id")
	int specId;
	
	public For_Option() {
		
	}
	
	public For_Option(Integer option_id, String option_code, int specId) {
		super();
		this.option_id = option_id;
		this.option_code = option_code;
		this.specId = specId;
	}
	

	public Integer getOption_id() {
		return option_id;
	}

	public void setOption_id(Integer option_id) {
		this.option_id = option_id;
	}

	public String getOption_code() {
		return option_code;
	}

	public void setOption_code(String option_code) {
		this.option_code = option_code;
	}

	public int getSpecId() {
		return specId;
	}

	public void setSpecId(int specId) {
		this.specId = specId;
	}

	@Override
	public String toString() {
		return "For_Option [option_id=" + option_id + ", option_code=" + option_code + ", specId="
				+ specId + "]";
	}



}
