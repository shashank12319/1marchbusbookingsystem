package com.wittybrains.busbookingsystem.repository;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.wittybrains.busbookingsystem.model.MyUser;

//UserService interface
public interface UserService {
 User createUser(User user);
 MyUser findByUsernameOrEmail(String usernameOrEmail);
 String generateToken(MyUser user);
}