package com.gl.repository;

import org.springframework.data.repository.CrudRepository;

import com.gl.entity.User;

public interface UsersRepository extends CrudRepository<User, Integer> {

	// crud repository takes care of writing queries on behalf of developer
	// select * from 
	
}
