package com.umar.controller;


import java.io.IOException;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//@EnableSpringDataWebSupport 
@RestController
public class For_Option_Controller {
	
	@Autowired
	private For_Option_Service service;


	

	@RequestMapping("all")
	public Iterable<For_Option> getAll(){
		
		return service.getAll();
	}
	

	@RequestMapping("all/{specId}")
	public Page<For_Option> getEntityService(@PathVariable int specId, Pageable pageable ) throws IOException{
		
		return service.getAllBySpecId(specId, pageable);
	}
	
	/*
	 * @RequestMapping("all/all") public Page<For_Option> getAllPaged(Pageable
	 * pageable){
	 * 
	 * return service.getAllPaged(pageable); }
	 */
	
	@RequestMapping("all/all1")
	public Slice<For_Option> getAllPaged1(Pageable pageable){
		
		return service.getAllPaged1(pageable);
	}
	
}
