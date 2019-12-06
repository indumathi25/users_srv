package com.users.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.users.dto.requests.UsersRegistrationDTO;

@RestController("/users")
public class UsersController {
	
	@PostMapping("/register")
	public void registerUser(@RequestBody UsersRegistrationDTO UsersRegistrationDTO) {
		
		
	}
	@PostMapping("/login")
	public void loginUsers() {
		
	}
	
	@PostMapping("/update_user")
	public void updateUsers() {
		
	}
	
	

}
