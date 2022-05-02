package com.gl.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.gl.entity.Address;
import com.gl.entity.User;
import com.gl.exception.UserException;
import com.gl.service.AddressService;
import com.gl.service.UserService;

@RestController
@RequestMapping("/app")
public class UserController {
	
	@Autowired UserService service;
	@Autowired AddressService aService;
	
	
	// assigning URI to RESTController methods
	@GetMapping("/users")
	public List<User> getAllUser()throws Exception
	{
		List<User> users=service.getAllUsers();
		if(users.isEmpty())
				throw new Exception("No Records Available to read");
		else
			return users;
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserDetails(@PathVariable("id")Integer id)throws UserException
	{
		try
		{
			User user=service.getUserDetails(id);
			return new ResponseEntity(user,HttpStatus.OK);
		}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User with id "+id+" does not exists...", e);
		}
	}
	
	@GetMapping("/addresses")
	public List<Address> getAllAddress()
	{
		return aService.getAllAddress();
	}
	
	
}
