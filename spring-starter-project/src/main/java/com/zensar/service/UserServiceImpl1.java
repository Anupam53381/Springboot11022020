package com.zensar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.entites.User;
import com.zensar.repository.UserRepository;

@Service
public class UserServiceImpl1 implements UserService {
	
	@Autowired
	private UserRepository repository;
	
	public User getUser(int userId) {
			return repository.getUser(userId);
	}

	public List<User> getAllUsers() {
		return repository.getAllUsers();
	}

	public void deleteUser(int userId) {
		repository.deleteUser(userId);

	}

	public void updateUser(User user) {
		repository.updateUser(user);
	}

	public void insertUser(User user) {
		repository.insertUser(user);
	}
}
