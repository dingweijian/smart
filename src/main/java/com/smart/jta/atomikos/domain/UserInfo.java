package com.smart.jta.atomikos.domain;

import java.io.Serializable;

/**
 * 
 */
public class UserInfo implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 3450307120572451762L;
    private String uid;
    private String uuserName;
    private String urealName;
    private String uremark1;
    private String uremark2;

    
   

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUuserName() {
		return uuserName;
	}

	public void setUuserName(String uuserName) {
		this.uuserName = uuserName;
	}

	public String getUrealName() {
		return urealName;
	}

	public void setUrealName(String urealName) {
		this.urealName = urealName;
	}

	public String getUremark1() {
		return uremark1;
	}

	public void setUremark1(String uremark1) {
		this.uremark1 = uremark1;
	}

	public String getUremark2() {
		return uremark2;
	}

	public void setUremark2(String uremark2) {
		this.uremark2 = uremark2;
	}

	

}
