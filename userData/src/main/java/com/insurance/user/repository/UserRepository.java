package com.insurance.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.insurance.user.models.UserDetails;

@Repository
public interface UserRepository extends MongoRepository<UserDetails, Integer> {

	UserDetails findById(int id); 
}
