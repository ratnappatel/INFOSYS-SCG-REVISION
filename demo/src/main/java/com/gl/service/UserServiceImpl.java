package com.gl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.entity.User;
import com.gl.repository.UsersRepository;

@Service
public class UserServiceImpl  implements UserService{
	
	@Autowired UsersRepository repository;

	@Override
	public List<User> getAllUsers() {
		
		return (List<User>) repository.findAll();
	}

	@Override
	public User getUserDetails(int id) {
		Optional<User> user=repository.findById(id);
		if(user.isPresent())
			return user.get();
		else
			return null;
	}
	
	

}
