package com.procasi.legalmansys.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.procasi.legalmansys.core.bean.User;

/**
 * 
 * @author EdgarOlvera
 */
@Controller
@RequestMapping(value="user")
public class UserController {
	
	/**
	 * 
	 * @param idUser
	 * @return
	 */
	@RequestMapping(value="/getUser", method=RequestMethod.GET)
	@ResponseBody
	public User getUser() {
		User user = new User();
		user.setIdUser(2234);
		user.setName("Chuchito Perez");
		user.setProfile("Admin");
		return user;
	}
}
