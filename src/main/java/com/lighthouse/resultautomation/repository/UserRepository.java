package com.lighthouse.resultautomation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lighthouse.resultautomation.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	
	

}
