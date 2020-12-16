package com.insurance.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.user.entity.Roles;
import com.insurance.user.repository.RoleRepository;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	public Roles saveRoles(Roles roles) {
		return roleRepository.save(roles);
	}
	
	public Roles getRoleById(int id) {
		return roleRepository.findRolesById(id);
	}
	
	public Roles updateRole(Roles roles) {
		Roles existing_role = roleRepository.findRolesById(roles.getId());
		existing_role.setRoleName(roles.getRoleName());
		return roleRepository.save(existing_role);
	}
	
	public Roles deleteRole(Roles roles) {
		Roles existing_role = roleRepository.findRolesById(roles.getId());
		existing_role.setInUse(0);;
		return roleRepository.save(existing_role);
	}
	
}
