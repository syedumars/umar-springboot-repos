package com.umar.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.umar.model.Alien;

@Repository
public interface AlienRepo extends JpaRepository<Alien, Integer> {

	public List<Alien> findByTechIgnoreCase(String Tech);
	
	public List<Alien> findByAidGreaterThan(Integer aid) ;
	
	@Query(value = "from Alien where tech=?1 order by A_NAME desc")
	public List<Alien> findByTechSortedByName(String tech);

}
