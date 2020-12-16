package com.insurance.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.user.models.UserDetails;
import com.insurance.user.repository.UserRepository;

@RestController
@RequestMapping("/data")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/add")
	public UserDetails saveUser(@RequestBody UserDetails userDetails) {
		System.out.println(userDetails.getAddress());
		return	userRepository.save(userDetails);
	}

	@GetMapping("/{id}")
	public UserDetails getUserbyId(@PathVariable int id) {
		return userRepository.findById(id);
	}
}

