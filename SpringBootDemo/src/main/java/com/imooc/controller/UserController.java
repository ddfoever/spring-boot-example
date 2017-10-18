package com.imooc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.dao.UserDao;
import com.imooc.entity.User;

@RestController
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value="/getUsers",method=RequestMethod.GET)
	@ResponseBody
	public List<User> getUsers(){
		List<User> users = new ArrayList<User>();
		users = userDao.getUsers();
		return users;
	}
}
