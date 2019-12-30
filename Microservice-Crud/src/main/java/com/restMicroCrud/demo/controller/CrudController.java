/**
 * 
 */
package com.restMicroCrud.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restMicroCrud.demo.dao.UserRepository;
import com.restMicroCrud.demo.entity.User;

/**
 * @author sneha
 *
 */
@RestController
public class CrudController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/")
	public String homePage() {
		System.out.println("crud controller");
		return "home.jsp";
	}
	
	@PostMapping("/user")
	public User addUserDetails(@RequestBody User user) {
		userRepository.save(user);
		System.out.println("user datails saved :"+user);
		return user;
	}
	
	@PutMapping("/user")
	public User updateUserDetails(@RequestBody User user) {
		userRepository.save(user);
		return user;
	}
	
	@DeleteMapping("/user/{userId}")
	public String deleteUserDetails(@PathVariable int userId) {
		userRepository.deleteById(userId);
		return "Deleted";
	}
	
	@GetMapping(path = "/user/all", headers = "Accept=application/json", produces = "application/json", consumes = "application/json")
	public List<User> fetchAllUsers() {
		List<User> users= userRepository.findAll();
		System.out.println("data fetched : "+users);
		return users;
	}
	
	@GetMapping("/user/{userId}")
	public Optional<User> fetchUserById(@PathVariable int userId) {
		Optional<User> user= userRepository.findById(userId);
		System.out.println("data fetched : "+user);
		return user;
	}

}

