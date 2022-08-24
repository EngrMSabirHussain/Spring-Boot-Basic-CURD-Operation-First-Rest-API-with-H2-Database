package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.User;


//interface class which is used to define all required methods
public interface UserServices {
	
	// used for add new user in database
	public User addUser(User user);
	
	// used for get user by it's id
	public Optional<User> findbById(int i);
	
	
	//used to get all user's from database
	public List<User> getAllUser();
	
	//used for delete user by it id from database
	public String delUser(int i);
	
	//used for update current user details by its id and pass data in body in JSON format
	public User updateUser(User user);
	
	
	//used to delete all record from current database
	public String delAllUsers();
}
