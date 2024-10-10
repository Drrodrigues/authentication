package com.simple.authentication.control;

import com.simple.authentication.entity.User;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestUtils {

	public static User createUser(String username, int age){
		User user = new User();
		user.setAge(age);
		user.setUsername(username);
		byte[] randomBiometricData = IntStream.range(1, 256).mapToObj(TestUtils::randomChar).map(Objects::toString)
				.collect(Collectors.joining()).getBytes();
		user.setBiometricData(randomBiometricData);
		user.setPassword("changeMe");
		return user;
	}

	private static char randomChar(int i){
		return (char) (Math.random() * 10 + 'A');
	}

}
