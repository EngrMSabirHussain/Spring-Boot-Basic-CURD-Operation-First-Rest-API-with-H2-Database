package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.services.UserServices;

@RestController
public class MyController {
	
	// used for auto wiring by spring JPA
	@Autowired
	UserServices userServices;
	
	
	// used for testing purpose
	@GetMapping("/H2")
	public String home() {
		return ("Welcom to Spring Boot H2 Database Contection Project");
	}
	
	
	// used for add new user in database
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userServices.addUser(user);
	}
	
	
	//used for update current user details by its id and pass data in body in JSON format
		@PostMapping("/updateUser")
		public User updateUser(@RequestBody User user) {
			return userServices.updateUser(user);
		}
	
	
    // used for get user by it's id
	@GetMapping("/getUser/{i}")
	public Optional<User> getUser(@PathVariable String i) {
		return userServices.findbById(Integer.parseInt(i));
	}
	
	
	
	//used to get all user's from database
	@GetMapping("/getAllUsers")
	public List<User> getAllUser() {
		return userServices.getAllUser();
	}
	
	
	//used for delete user by it id from database
	@GetMapping("/delUser/{i}")
	public String delUser(@PathVariable String i) {
		return userServices.delUser(Integer.parseInt(i));
	}
	
	
	
	//used to delete all record from current database
	@GetMapping("/delAllUsers")
	public String delAllUsers() {
		return userServices.delAllUsers();
	}
	
	
	
	
}

