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

import lombok.extern.slf4j.Slf4j;


public class RolesController {
	 	@Autowired
		private RoleService roleService;
		
		@PostMapping("/add")
		public Roles saveRole(Roles role) {
			System.out.println("RoleName "+role.getRoleName());
			System.out.println("RoleName "+role.getInUse());
			
			return roleService.saveRoles(role);
		}
		
		@GetMapping("/role/{id}")
		public Roles findUserById(@PathVariable int id) {
			return roleService.getRoleById(id);
		}
		
		@PutMapping("/update")
		public Roles updateUser(@RequestBody Roles role){
		  return roleService.updateRole(role);
		}
		 
		@PutMapping("/delete/")
		public Roles deleteUser(@RequestBody Roles role){
		  return roleService.deleteRole(role);
		}
	
}
