package com.zensar.repository;

import java.util.List;

import com.zensar.entites.User;

public interface UserRepository {

	public User getUser(int userId);

	public List<User> getAllUsers();

	public void deleteUser(int userId);

	public void updateUser(User user);

	public void insertUser(User user);

}
