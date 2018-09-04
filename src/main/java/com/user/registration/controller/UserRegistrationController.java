package com.user.registration.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.registration.model.User;

@RestController
public class UserRegistrationController {

	static List<User> userList = new ArrayList<User>();
	
	@RequestMapping ("/ping")
	 public String ping(){
		
		    User user = new User();
			user.setFirstNm("sanjeevi");
			user.setLastNm("Rangaswamy");
			user.setAddressLine("sundarapuram");
			user.setId("1");
			user.setCountry("IN");
			user.setState("TN");
			user.setCity("coimbatore");
			userList.add(user);
			user = new User();
			user.setFirstNm("Chandran");
			user.setLastNm("Chandran");
			user.setAddressLine("sundarapuram");
			user.setId("2");
			user.setCountry("IN");
			user.setState("TN");
			user.setCity("Erode");
			userList.add(user);
			
			user = new User();
			user.setFirstNm("karthik");
			user.setLastNm("Chandran");
			user.setAddressLine("sundarapuram");
			user.setId("3");
			user.setCountry("IN");
			user.setState("TN");
			userList.add(user);
			return "Success";
	 }
	
	@RequestMapping ("/user/details")
	 public List<User> getUserDetails(){
		
		
		return userList;
		
	 }
	@RequestMapping (method=RequestMethod.POST , value="/user/add")
	 public String addUser(@RequestBody User user) {
	     userList.add(user);
		 return "Success";
	 }
	 
	@RequestMapping (method=RequestMethod.PUT , value="/user/update")
	 public String updateUser(@RequestBody User userDetails) {
	     boolean userFound =false;
		 for(User user : userList) {
			 if(userDetails.getId().equalsIgnoreCase(user.getId())) {
				    user.setFirstNm(userDetails.getFirstNm());
					user.setLastNm(userDetails.getLastNm());
					user.setAddressLine(userDetails.getAddressLine());
					user.setCountry(userDetails.getCountry());
					user.setState(userDetails.getState());
					user.setCity(userDetails.getCity());
					userFound= true;
					break;
			 }
		 }
		 if(userFound) return "Success"; 
		 else return "No user Found";
	 }
	
	
	@DeleteMapping (value="/user/{id}/delete")
	 public String deleteUser(@PathVariable  String id) {
	     boolean userFound =false;
		 for(User user : userList) {
			 if(user.getId().equalsIgnoreCase(id)) {
				   userList.remove(user);
					userFound= true;
					break;
			 }
		 }
		 if(userFound) return "Success"; 
		 else return "No user Found";
	 }
	
}
