package com.procasi.alms.core.service.serviceimplementation;

import java.util.Date;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.procasi.alms.core.bean.User;
import com.procasi.alms.core.persistence.dao.daoimplementation.UserDaoImplementation;
import com.procasi.alms.core.service.UserService;

/**
 * The user service implementation.
 * 
 * @author EdgarOlvera
 */
public class UserServiceImplementation implements UserService {

//	@Autowired
//	UserDao userDao;
	
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

	@Transactional
	@Override
	public List<User> getAllUsers() {
		UserDaoImplementation dao = new UserDaoImplementation();
		return dao.findAllUsers();
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