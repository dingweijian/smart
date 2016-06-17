package com.smart.jta.atomikos.mapper.newf;

import java.util.List;
import java.util.Map;

public interface BankAccountMapper {

	public List selectBankAccount();
	
	public void updateBankAccount(Map map);
	
	
}
