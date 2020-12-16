package com.insurance.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.user.entity.Roles;

@Repository
public interface RoleRepository extends JpaRepository<Roles, Integer>{

	Roles findRolesById(int id);

}
