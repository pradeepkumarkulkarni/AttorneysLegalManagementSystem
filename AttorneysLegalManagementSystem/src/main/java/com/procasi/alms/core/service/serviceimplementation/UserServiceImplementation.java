package com.procasi.alms.core.service.serviceimplementation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.procasi.alms.core.bean.User;
import com.procasi.alms.core.service.UserService;

/**
 * The user service implementation.
 * 
 * @author EdgarOlvera
 */
public class UserServiceImplementation implements UserService {

	@Override
	public User getUser() {
		System.out.println("getUser service");
		User user = new User();
		user.setIdUser(2234);
		user.setPass("Password1");
		user.setName("Joni Bony");
		user.setProfile("Admin");
		user.setLastLoginDate(new Date());
		user.setStatus("Active");
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		System.out.println("getAllUsers service");
		List<User> users = new ArrayList<User>();		
		User user = new User();
		user.setIdUser(3333);
		user.setPass("Password1");
		user.setName("George Washington");
		user.setProfile("Administrator");
		user.setLastLoginDate(new Date());
		user.setStatus("Active");
		users.add(user);
		
		user = new User();
		user.setIdUser(4444);
		user.setPass("Password2");
		user.setName("Marie Curie");
		user.setProfile("Lawyer");
		user.setLastLoginDate(new Date());
		user.setStatus("Inactive");
		users.add(user);
		
		user = new User();
		user.setIdUser(5555);
		user.setPass("Password3");
		user.setName("Master Chef");
		user.setProfile("Lawyer");
		user.setLastLoginDate(new Date());
		user.setStatus("Suspended");
		users.add(user);
		
		user = new User();
		user.setIdUser(6666);
		user.setPass("Password4");
		user.setName("Bill Gates");
		user.setProfile("Secretary");
		user.setLastLoginDate(new Date());
		user.setStatus("Active");
		users.add(user);
		
		user = new User();
		user.setIdUser(6666);
		user.setPass("Password5");
		user.setName("Marcus Phoenix");
		user.setProfile("Invited");
		user.setLastLoginDate(new Date());
		user.setStatus("Active");
		users.add(user);
		return users;
	}

	@Override
	public long saveUser() {
		System.out.println("saveUser service");
		return 100;
	}

	@Override
	public long updateUser() {
		System.out.println("updateUser service");
		return 200;
	}

}
