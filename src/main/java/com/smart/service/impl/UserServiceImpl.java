package com.smart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.dao.UserMapper;
import com.smart.domain.User;
import com.smart.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;

	
	public boolean doTranfer(String name1, String name2, float deposit) {
		System.out.println(name1 + " 转给 " + name2 + ' ' + deposit + "钱");
    	return true;
	}
	
	public List selectUsers(){
		List<User> users = userMapper.selectUsers();
		System.out.println(users.size());
		return userMapper.selectUsers();
	}
}
