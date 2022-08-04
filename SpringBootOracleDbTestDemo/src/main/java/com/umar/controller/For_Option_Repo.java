package com.umar.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface For_Option_Repo extends CrudRepository<For_Option, Integer> {

	Page<For_Option> findAllBySpecId( int specId, Pageable pageable);

	//Page<For_Option> findAll (Pageable pageable);
	
	Slice<For_Option> findAll (Pageable pageable);

}
