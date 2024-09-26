package com.simple.authentication.boundary;

import com.simple.authentication.control.AuthenticationService;
import com.simple.authentication.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("authentication")
public class AuthenticationController {

	@Autowired
	private AuthenticationService authenticationService;

	@GetMapping("users")
	public List<User> getAllUsers(){
		return authenticationService.findAll();
	}

}
