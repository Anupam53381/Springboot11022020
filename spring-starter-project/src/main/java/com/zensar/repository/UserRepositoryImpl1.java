package com.zensar.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zensar.entites.User;

@Repository
public class UserRepositoryImpl1 implements UserRepository {
	
	static List<User> users = new ArrayList<>();

	static {
		users.add(new User(100, "RAHUL", 10));
	}

	public User getUser(int userId) {

		for (User user : users) {
			if (user.getUserId() == userId) {
				return user;
			}
		}

		return null;
	}

	public List<User> getAllUsers() {
		return users;
	}

	public void deleteUser(int userId) {
		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			if (user.getUserId() == userId) {
				users.remove(user);
			}
		}

	}

	public void updateUser(User user) {
		System.out.println("User Updated");
	}

	public void insertUser(User user) {
		users.add(user);
	}

	
}
