package com.user.registration.service;

import java.util.List;

import com.user.registration.model.User;

public interface UserRegService {

	public List<User> getUserDetails();
	public String addUser(User user);
	public String updateUser(User userDetails);
	public String deleteUser(String id) ;
	
}
