package com.zensar.repository;

import org.springframework.data.repository.CrudRepository;

import com.zensar.entites.User;

public interface UserRepository extends CrudRepository<User,Integer> {

	

}
