package com.insurance.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.user.entity.Users;
import com.insurance.user.repository.RoleRepository;
import com.insurance.user.repository.UserRepository;
import com.insurance.user.service.UserService;

@RestController
@RequestMapping("/oauth")
public class UserController {
	@Autowired
	private UserService userService;
    @PostMapping("/user/create")
    public void createUser(@RequestBody Users user){
    	userService.saveUser(user);
    }
}
