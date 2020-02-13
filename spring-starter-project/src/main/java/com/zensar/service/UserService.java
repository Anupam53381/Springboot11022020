package com.zensar.service;

import java.util.List;
import java.util.Optional;

import com.zensar.entites.User;

public interface UserService {

	public Optional<User> getUser(int userId);

	public Iterable<User> getAllUsers();

	public void deleteUser(int userId);

	public void updateUser(User user);

	public void insertUser(User user);

}
