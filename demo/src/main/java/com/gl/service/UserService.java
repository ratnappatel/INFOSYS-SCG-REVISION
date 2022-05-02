package com.gl.service;

import java.util.List;

import com.gl.entity.User;
import com.gl.exception.UserException;

public interface UserService {
	
	public List<User> getAllUsers();
	public User getUserDetails(int id)throws UserException;

}
