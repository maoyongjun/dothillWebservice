package org.foxconn.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.foxconn.entity.Msg;

/**
* @author:myz
* @version 1.0 
* ����ʱ�䣺2018��5��25�� ����9:14:00
*/
@Mapper
public interface WebServiceDao {
	public String getSSNStatus(Map<String,String> map); 
//	public Map<String,String>  getSSNStatus(Map<String,String> map); 
	public void updateSSNStatus(Map<String,String> map);
}
