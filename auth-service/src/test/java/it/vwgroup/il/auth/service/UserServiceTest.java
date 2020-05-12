package it.vwgroup.il.auth.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import it.vwgroup.il.auth.domain.User;
import it.vwgroup.il.auth.repository.UserRepository;
import it.vwgroup.il.auth.service.UserServiceImpl;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

public class UserServiceTest {

	@InjectMocks
	private UserServiceImpl userService;

	@Mock
	private UserRepository repository;

	@Before
	public void setup() {
		initMocks(this);
	}

	@Test
	public void shouldCreateUser() {

		User user = new User();
		user.setUsername("name");
		user.setPassword("password");

		userService.create(user);
		verify(repository, times(1)).save(user);
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldFailWhenUserAlreadyExists() {

		User user = new User();
		user.setUsername("name");
		user.setPassword("password");

		when(repository.findById(user.getUsername())).thenReturn(Optional.of(new User()));
		userService.create(user);
	}
}
