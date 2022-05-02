package com.gl.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.entity.Address;
import com.gl.entity.User;
import com.gl.service.AddressService;
import com.gl.service.UserService;

@RestController
@RequestMapping("/app")
public class UserController {
	
	@Autowired UserService service;
	@Autowired AddressService aService;
	
	
	// assigning URI to RESTController methods
	@GetMapping("/users")
	public List<User> getAllUser()
	{
		return service.getAllUsers();
	}
	
	@GetMapping("/users/{id}")
	public User getUserDetails(@PathVariable("id")Integer id)
	{
		return service.getUserDetails(id);
	}
	
	@GetMapping("/addresses")
	public List<Address> getAllAddress()
	{
		return aService.getAllAddress();
	}
	
	
}
