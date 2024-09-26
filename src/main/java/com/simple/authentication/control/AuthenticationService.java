package com.simple.authentication.control;

import com.simple.authentication.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class AuthenticationService {

	@Autowired
	private final AuthenticationRepository authenticationRepository;

	public List<User> findAll() {
		return authenticationRepository.findAll();
	}

	public String save() {
		// to be implemented
		return null;
	}

	public User find() {
		// to be implemented
		return null;
	}

	public boolean login(String username, byte[] biometricData) {
		// to be implemented
		return false;
	}

	public List<User> findUnder18Users() {
		// to be implemented
		return null;
	}

	public String delete() {
		// to be implemented
		return null;
	}

}
