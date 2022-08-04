package com.umar;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlienRepository extends CrudRepository<Alien, Integer> {

}
