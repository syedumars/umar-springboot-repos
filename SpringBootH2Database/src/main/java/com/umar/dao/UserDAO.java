package com.umar.dao;

import org.springframework.data.repository.CrudRepository;

import com.umar.model.User;

public interface UserDAO extends CrudRepository<User, Integer> {

}
