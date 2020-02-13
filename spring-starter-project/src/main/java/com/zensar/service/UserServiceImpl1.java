package com.zensar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.entites.User;
import com.zensar.repository.UserRepository;

@Service
public class UserServiceImpl1 implements UserService {
	
	@Autowired
	private UserRepository repository;
	
	public Optional<User> getUser(int userId) {
			return repository.findById(userId);
	}

	public Iterable<User> getAllUsers() {
		return repository.findAll();
	}

	public void deleteUser(int userId) {
		repository.deleteById(userId);

	}

	public void updateUser(User user) {
		repository.save(user);
	}

	public void insertUser(User user) {
		repository.save(user);
	}
}
