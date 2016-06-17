package com.smart.jta.atomikos.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.jta.atomikos.domain.BankAccount;
import com.smart.jta.atomikos.mapper.main.UserInfoMapper;
import com.smart.jta.atomikos.mapper.newf.BankAccountMapper;
import com.smart.jta.atomikos.service.BankAccountService;

/**
 * @author michael <br>
 *         blog: http://sjsky.iteye.com
 */

@Service
public class BankAccountServiceImpl implements BankAccountService {

	@Autowired
    private BankAccountMapper bankAccountMapper;

	@Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 转账测试
     * @param srcId
     * @param destId
     * @param money
     * @return boolean
     */
    public boolean doTestTransfer(String srcId, String destId, float money) throws Exception{

    	/*bankAccountMapper srcAccount = bankAccountMapper.getByUserName(srcId);
    	bankAccountMapper destAccount = bankAccountMapper.getByUserName(destId);
        if (srcAccount.getDeposit() < money) {
            System.out.println("warn :" + srcAccount.getUserName()
                    + " has not enough money to transfer");
            return false;
        }
        srcAccount.setDeposit(srcAccount.getDeposit() - money);
        destAccount.setDeposit(destAccount.getDeposit() + money);
        bankAccountMapper.update(srcAccount);
        bankAccountMapper.update(destAccount);

        Date curTime = new Date();
        UserInfo srcUser = userInfoMapper.getById(srcId);
        UserInfo destUser = userInfoMapper.getById(destId);

        destUser.setRemark1(curTime + "");
        destUser.setRemark2(curTime + "");
        userInfoMapper.update(destUser);
        srcUser.setRemark1(curTime + "");
        if (srcAccount.getDeposit() < 18000) {
            throw new RuntimeException("michael test exception for JTA  ");
        }
        srcUser.setRemark2(curTime + "");
        userInfoMapper.update(srcUser);
        System.out.println("success done:" + srcAccount.getUserName()
                + " transfer ￥" + money + " to " + destAccount.getUserName());*/
    	try {
			
		
	    	Map map1 = new HashMap();
	    	map1.put("ID", "1");
	    	map1.put("USERNAME", "ding_wei");
	    	userInfoMapper.updateUserInfo(map1);
	    	
	    	Map map2 = new HashMap();
	    	map2.put("ID", "b1");
	    	map2.put("DEPOSIT", "DD");
	    	bankAccountMapper.updateBankAccount(map2);
    	} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
    	/*if(false){
    		throw new Exception("测试分布式事务");
    	}*/
    	
        return true;
    }

    public boolean testTransfer(String srcId, String destId, float money){
    	System.out.println(srcId + " 转给 " + destId + ' ' + money + "钱");
    	return true;
    }

	@Override
	public List selectBankAccount() {
		List<BankAccount> list = bankAccountMapper.selectBankAccount();
		System.out.println("bankAccount sile -->" + list.size());
		return null;
	}

}
