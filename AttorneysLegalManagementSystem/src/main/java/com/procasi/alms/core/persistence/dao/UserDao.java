package com.procasi.alms.core.persistence.dao;

import java.util.List;

import com.procasi.alms.core.bean.User;

public interface UserDao {
	
	List<User> findAllUsers();

}
