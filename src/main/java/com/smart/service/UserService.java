package com.smart.service;

import java.util.List;

public interface UserService {

	public boolean doTranfer(String name1, String name2, float deposit);
	public List selectUsers();
}
