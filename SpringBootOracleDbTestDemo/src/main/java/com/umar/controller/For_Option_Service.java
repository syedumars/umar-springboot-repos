package com.umar.controller;



import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;



@Component
public class For_Option_Service {
	
	@Autowired
	private For_Option_Repo repo;
	
	//GET
		public  Iterable<For_Option> getAll() {
		
		return  repo.findAll();
	}

		
		//new 
		public Page<For_Option> getAllBySpecId(int specId, Pageable pageable) throws IOException{
			// TODO Auto-generated method stub
			return repo.findAllBySpecId(specId, pageable);
		}


		/*
		 * public Page<For_Option> getAllPaged(Pageable pageable) { // TODO
		 * Auto-generated method stub return repo.findAll( pageable); }
		 */
		
		public Slice<For_Option> getAllPaged1(Pageable pageable) {
			
			return repo.findAll( pageable);
		}

}
