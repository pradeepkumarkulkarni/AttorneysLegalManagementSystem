package com.procasi.alms.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
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
	@Qualifier(value = "UserServiceTest")
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
		return this.userService.getUser();
	}
	
	/**
	 * Handle the all users request.
	 * 
	 * @return All the users into a list.
	 */
	@RequestMapping(value="/getAllUsers", method=RequestMethod.GET)
	@ResponseBody
	public List<User> getAllUsers() {
		return this.getAllUsers();
	}
}
