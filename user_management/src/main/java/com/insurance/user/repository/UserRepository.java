package com.insurance.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.user.entity.Users;

@Repository

public interface UserRepository extends JpaRepository<Users, Integer>{

	Users findUsersById(int id);
	void deleteById(int id);
}
