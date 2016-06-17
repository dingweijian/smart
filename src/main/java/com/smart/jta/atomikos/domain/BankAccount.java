package com.smart.jta.atomikos.domain;

import java.io.Serializable;

/**
 * 用户存款
 * @author michael <br>
 *         blog: http://sjsky.iteye.com
 */
public class BankAccount implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -2177992568468527776L;

    private int b_id;
    private String b_userName;
    private float b_deposit;
    
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getB_userName() {
		return b_userName;
	}
	public void setB_userName(String b_userName) {
		this.b_userName = b_userName;
	}
	public float getB_deposit() {
		return b_deposit;
	}
	public void setB_deposit(float b_deposit) {
		this.b_deposit = b_deposit;
	}

    

}
