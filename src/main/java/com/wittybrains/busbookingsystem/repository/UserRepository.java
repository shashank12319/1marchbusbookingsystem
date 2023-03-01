package com.wittybrains.busbookingsystem.repository;


import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;



import com.wittybrains.busbookingsystem.model.MyUser;



public interface UserRepository extends JpaRepository<MyUser, Long> {


	  MyUser findByEmail(String email);
 
	  MyUser findByUsername(String username);
}
