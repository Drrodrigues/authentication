package com.simple.authentication.control;

import com.simple.authentication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface AuthenticationRepository extends JpaRepository<User, String> {

	default List<User> findUnder18Users(){
		return new ArrayList<>();
	}
}
