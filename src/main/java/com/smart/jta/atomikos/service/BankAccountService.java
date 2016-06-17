package com.smart.jta.atomikos.service;

import java.util.List;


/**
 * @author michael <br>
 *         blog: http://sjsky.iteye.com
 */
public interface BankAccountService {

    /**
     * @param srcId
     * @param destId
     * @param money
     * @return boolean
     */
    boolean doTestTransfer(String srcId, String destId, float money) throws Exception;

    public boolean testTransfer(String srcId, String destId, float money);
    
    public List selectBankAccount();
}
