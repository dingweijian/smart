package com.smart.jta.atomikos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.jta.atomikos.domain.UserInfo;
import com.smart.jta.atomikos.mapper.main.UserInfoMapper;
import com.smart.jta.atomikos.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Override
	public List selectUserInfo() {
		List<UserInfo> list = userInfoMapper.selectUserInfo();
		System.out.println("userInfo list -->" + list.size());
		return userInfoMapper.selectUserInfo();
	}

}
