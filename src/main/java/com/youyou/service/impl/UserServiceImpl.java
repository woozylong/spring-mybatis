package com.youyou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youyou.dao.IUserDao;
import com.youyou.model.User;
import com.youyou.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserDao userDao;
	
	public User getUserById(int userId) {
		return userDao.getUserById(userId);
	}

}
