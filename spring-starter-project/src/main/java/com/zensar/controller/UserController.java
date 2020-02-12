package com.zensar.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entites.User;

@RestController
@RequestMapping(value = "/v1/users", produces = { MediaType.APPLICATION_JSON_VALUE })
public class UserController {

	// CRUD -> Create(insert),Read(1,All),Update,delete
	// http://localhost:8080/user -> http->GET

	// http://localhost:8080/users/
	// @RequestMapping(value = "/",method=RequestMethod.GET)

	static List<User> users = new ArrayList<>();

	static {
		users.add(new User(1001, "Ramesh", 10000));
	}

	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") int userId) {

		for (User user : users) {
			if (user.getUserId() == userId) {
				return user;
			}
		}

		return null;
	}

	@GetMapping()
	public List<User> getAllUsers() {
		return users;
	}

	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable("userId") int userId) {
		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			if (user.getUserId() == userId) {
				users.remove(user);
			}
		}

	}

	@PutMapping()
	public void updateUser(User user) {
		System.out.println("User Updated");
	}

	@PostMapping()
	public void insertUser(@RequestBody User user) {
		users.add(user);
	}
}
