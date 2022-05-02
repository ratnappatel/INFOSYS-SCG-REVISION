package com.gl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gl.entity.User;
import com.gl.service.UserService;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner
{
	@Autowired UserService service;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//get();
	}
	
	public void get()
	{
		System.out.println("====================================================");
		List<User> users=service.getAllUsers();
		for(User u:users)
			System.out.println(u);
		System.out.println("====================================================");
	}

}
