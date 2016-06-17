package com.smart.jta.atomikos.mapper.main;

import java.util.List;
import java.util.Map;

public interface UserInfoMapper {

	/*public UserInfo getById(String userName);
	
	public void update(UserInfo userInfo);*/
	
	public List selectUserInfo();
	
	public int updateUserInfo(Map map);
}
