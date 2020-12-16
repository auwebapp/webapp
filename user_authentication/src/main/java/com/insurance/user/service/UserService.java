package com.insurance.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.user.entity.Users;
import com.insurance.user.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public Users saveUser(Users user) {
		 return userRepository.save(user);
	}

}
