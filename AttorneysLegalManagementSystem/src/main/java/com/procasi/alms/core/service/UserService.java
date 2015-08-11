package com.procasi.alms.core.service;

import java.util.List;

import com.procasi.alms.core.bean.User;

/**
 * The User services.
 * 
 * @author EdgarOlvera
 */
public interface UserService {

	/**
	 * Gets an User object.
	 * 
	 * @param userId
	 * 			The user identifier.
	 * @return an User.
	 */
	User getUser();
	
	/**
	 * Gets all existing users.
	 * 
	 * @return the users list.
	 */
	List<User> getAllUsers();
	
	/**
	 * Saves an user.
	 * 
	 * @return the user identifier.
	 */
	long saveUser();
	
	/**
	 * Modifies an user.
	 * 
	 * @return the user identifier.
	 */
	long updateUser();
}
