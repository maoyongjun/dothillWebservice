package org.foxconn.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
* @author:myz
* @version 1.0 
* ����ʱ�䣺2018��5��25�� ����9:15:03
*/
@XmlRootElement
public class Msg implements Serializable{
	private 	String 	retflag;
	private 	String 	retmsg;
	
	public String getRetflag() {
		return retflag;
	}
	public void setRetflag(String retflag) {
		this.retflag = retflag;
	}
	public String getRetmsg() {
		return retmsg;
	}
	public void setRetmsg(String retmsg) {
		this.retmsg = retmsg;
	}
	
	


	
}
