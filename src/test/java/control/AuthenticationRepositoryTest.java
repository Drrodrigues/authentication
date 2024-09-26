package control;

import com.simple.authentication.control.AuthenticationRepository;
import com.simple.authentication.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class AuthenticationRepositoryTest {

	@Autowired
	private AuthenticationRepository authenticationRepository;

	@Test
	public void shouldListUnder18Users() {
		User user1 = TestUtils.createUser("user", 10);
		User user2 = TestUtils.createUser("user2", 20);
		authenticationRepository.save(user1);
		authenticationRepository.save(user2);
		List<User> usersUnder18 = authenticationRepository.findUnder18Users();
		Assertions.assertFalse(usersUnder18.isEmpty());
	}

}
