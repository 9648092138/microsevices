package com.op.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.op.eureka.model.Users;

@RestController
@RequestMapping(path = "/user")
public class UserController {

	@PostMapping(value = "/registration")
	public Users register(@RequestBody Users user) {
		return user;
		
	}
	
	@GetMapping(value="/getUser")
	public Users getuser() {
		Users users = new Users();
		users.setId(1);
		users.setUserName("om");
		users.setUserEmail("op745891@gmail.com");
		return users;
		
		
	}
}
