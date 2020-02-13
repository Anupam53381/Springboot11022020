package com.zensar.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.zensar.service.UserService;

@RestController
@RequestMapping(value = "/v1/users", produces = { MediaType.APPLICATION_JSON_VALUE })
public class UserController {

	// CRUD -> Create(insert),Read(1,All),Update,delete
	// http://localhost:8080/user -> http->GET

	// http://localhost:8080/users/
	// @RequestMapping(value = "/",method=RequestMethod.GET)

	@Autowired
	private UserService service;

	@GetMapping("/{userId}")
	public Optional<User> getUser(@PathVariable("userId") int userId) {
		return service.getUser(userId);
	}

	@GetMapping()
	public Iterable<User> getAllUsers() {
		return service.getAllUsers();
	}

	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable("userId") int userId) {
		service.deleteUser(userId);
	}

	@PutMapping()
	public void updateUser(User user) {
		service.updateUser(user);
	}

	@PostMapping()
	public void insertUser(@RequestBody User user) {
		service.insertUser(user);
	}
}
