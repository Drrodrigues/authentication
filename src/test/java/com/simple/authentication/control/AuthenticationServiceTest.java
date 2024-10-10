package com.simple.authentication.control;

import com.simple.authentication.control.AuthenticationRepository;
import com.simple.authentication.control.AuthenticationService;
import com.simple.authentication.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AuthenticationServiceTest {

	private AuthenticationRepository authenticationRepository = Mockito.mock(AuthenticationRepository.class);

	private AuthenticationService authenticationService = new AuthenticationService(authenticationRepository);

	@Test
	public void shouldFindAllUsers() {
		List<User> users = new ArrayList<>();
		users.add(TestUtils.createUser("user", 20));
		Mockito.when(authenticationRepository.findAll()).thenReturn(users);
		Assertions.assertFalse(authenticationService.findAll().isEmpty());
	}



}
