package com.controller;

import com.dao.AdminDao;
import com.dao.StateDao;
import com.dao.UserDao;

public class UserController {

	public UserDao userDao;
	public StateDao stateDao;
	public AdminDao adminDao;

	// constructor injection
	public UserController(UserDao userDao,StateDao stateDao) {
		this.userDao = userDao;
		this.stateDao = stateDao;
	}

	public AdminDao getAdminDao() {
		return adminDao;
	}

	// setter injection
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

}
