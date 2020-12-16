package com.insurance.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.user.entity.Roles;



public interface RoleRepository extends JpaRepository<Roles, Integer> {
}
