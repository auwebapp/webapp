package com.insurance.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.user.entity.Roles;
import com.insurance.user.entity.Users;
import com.insurance.user.service.RoleService;
import com.insurance.user.service.UserService;

import com.insurance.user.dao.UserRoleDao;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public Users saveUser(@RequestBody Users user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public Users getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	
	@GetMapping("/role/{id}")
	public UserRoleDao getUser(@PathVariable int id) {
		return userService.getUserByRole(id);
	}
	
	 @PutMapping("/update")
	    public Users updateUser(@RequestBody Users user){
	        return userService.updateUser(user);
	}
	 
	 @PutMapping("/delete/")
	    public Users deleteUser(@RequestBody Users user){
	        return userService.deleteUser(user);
	}
	
	
}
