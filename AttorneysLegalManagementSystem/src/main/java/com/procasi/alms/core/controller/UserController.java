package com.procasi.alms.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.procasi.alms.core.bean.User;
import com.procasi.alms.core.service.UserService;

/**
 * The User controller.
 * 
 * @author EdgarOlvera
 */
@Controller
@RequestMapping(value="user")
public class UserController {
	
	@Autowired
	@Qualifier(value = "UserServiceMock")
	UserService userService;
	
	/**
	 * Handle the getUser request.
	 * 
	 * @param idUser
	 * 			The user's identifier.
	 * @return an User object.
	 */
	@RequestMapping(value="/getUser", method=RequestMethod.GET)
	@ResponseBody
	public User getUser() {
		System.out.println("get User controller service");
		return this.userService.getUser();
	}
	
	/**
	 * Handle the getAllUsers request.
	 * 
	 * @return All the users into a list.
	 */
	@RequestMapping(value="/getAllUsers", method=RequestMethod.GET)
	@ResponseBody
	public List<User> getAllUsers() {
		System.out.println("get all Users controller service");
		return this.userService.getAllUsers();
	}
	
	/**
	 * Handle the saveUser request.
	 * 
	 * @return the user identifier.
	 */
	@RequestMapping(value="/saveUser", method=RequestMethod.POST)
	@ResponseBody
	public long saveUser(@RequestBody User user) {
		System.out.println("save user controller service");
		System.out.println("ID: " + user.getIdUser());
		System.out.println("Name: " + user.getName());
		System.out.println("Password: " + user.getPass());
		System.out.println("Profile: " + user.getProfile());
		System.out.println("Status: " + user.getStatus());
		System.out.println("Last Login Date: " + user.getLastLoginDate());
		
		return this.userService.saveUser();
	}
	
	/**
	 * Handle the updateUser request.
	 * 
	 * @return the user identifier.
	 */
	@RequestMapping(value="/updateUser", method=RequestMethod.PUT)
	@ResponseBody
	public long updateUser(@RequestBody User user) {
		System.out.println("update user controller service");
		System.out.println("ID: " + user.getIdUser());
		System.out.println("Name: " + user.getName());
		System.out.println("Password: " + user.getPass());
		System.out.println("Profile: " + user.getProfile());
		System.out.println("Status: " + user.getStatus());
		System.out.println("Last Login Date: " + user.getLastLoginDate());
		return this.userService.updateUser();
	}
}
