package com.insurance.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.insurance.user.entity.Roles;
import com.insurance.user.entity.Users;
import com.insurance.user.dao.UserRoleDao;
import com.insurance.user.repository.RoleRepository;
import com.insurance.user.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	public Users saveUser(Users user) {
		return userRepository.save(user);
	}

	public Users getUserById(int id) {
		return userRepository.findUsersById(id);
	}

	public Users updateUser(Users user) {
		Users existingUser = userRepository.findUsersById(user.getId());
		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
		existingUser.setEmail(user.getEmail());
		existingUser.setPassword(user.getPassword());
		existingUser.setRole_id(user.getRole_id());
		existingUser.setInUse(user.getInUse());
        return userRepository.save(existingUser);
	}

	public Users deleteUser(Users user) {
		Users existingUser_table = userRepository.findUsersById(user.getId());
        existingUser_table.setInUse(0);
        return userRepository.save(existingUser_table);
	}

	public UserRoleDao getUserByRole(int id) {
		UserRoleDao userRoleDao = new UserRoleDao();
		Users user = userRepository.findUsersById(id);
		Roles roles = roleRepository.findRolesById(user.getRole_id());
		userRoleDao.setUsers(user);
		userRoleDao.setRoles(roles);
		return userRoleDao;
	}
	
}
