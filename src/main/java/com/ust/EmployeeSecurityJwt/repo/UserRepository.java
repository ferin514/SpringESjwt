package com.ust.EmployeeSecurityJwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.EmployeeSecurityJwt.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

	User findByUsername(String username);





	

}
