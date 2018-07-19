package org.foxconn.seagate.service.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.foxconn.dao.WebServiceDao;
import org.foxconn.entity.Msg;
import org.foxconn.seagate.service.CommonService;
import org.foxconn.util.XmlUtil;
import org.springframework.stereotype.Component;

/**
* @author:myz
* @version 1.0 
* 创建时间：2018年5月12日 下午7:06:58
*/
@WebService(serviceName = "Service1", // 与接口中指定的name一致
targetNamespace = "http://impl.service.seagate.foxconn.org", // 与接口中的命名空间一致,一般是接口的包名倒
endpointInterface = "org.foxconn.seagate.service.CommonService"// 接口地址
)
@Component
public class CommonServiceImpl implements CommonService {
	Logger logger = Logger.getLogger(CommonServiceImpl.class);
	@Resource
	private WebServiceDao dao;
	@Resource
	HttpServletRequest request;
@Override
public String getSSNStatusByInput(@WebParam(name="strPlantCode")String strPlantCode,@WebParam(name = "strSSN") String strSSN){
	logger.info(request.getRemoteAddr()+":"+"strPlantCode:"+strPlantCode+",strSSN:"+strSSN);
	Map<String,String> map = new HashMap<String,String>();
	map.put("plant", strPlantCode);
	map.put("ssn", strSSN);
	map.put("retflag","");
	map.put("retmsg","");
	String result="";
	try {
		 dao.getSSNStatus( map);
		 result = map.get("retmsg");
		 result = XmlUtil.formateXML(result).replace("<?xml version=\"1.0\" encoding=\"utf-8\"?>", "");
	} catch (Exception e) {
		String errorMsg = e.getCause().toString();
		logger.error(errorMsg);
		int length=errorMsg.length();
		return length>200?errorMsg.substring(0, 200):errorMsg;
	}
	writeLog(strSSN,result);
	return result;
}
public String updateSSNStatusByInput(String PlantCode, String SSN, String FixtureID, String TestResult, String ErrorCode,
		String FailDetailReason, String TestDatatime, String EMPID, String DIAG, String CurStation, String LineName, 
		String Field1, String Field2, String Field3)  {
	if(null!=PlantCode){
		PlantCode=PlantCode.trim();
	}
	if(null!=SSN){
		SSN=SSN.trim();
	}
	if(null!=FixtureID){
		FixtureID=FixtureID.trim();
	}
	if(null!=TestResult){
		TestResult=TestResult.trim();
	}
	if(null!=ErrorCode){
		ErrorCode=ErrorCode.trim();
	}
	if(null!=FailDetailReason){
		FailDetailReason=FailDetailReason.trim();
	}
	if(null!=TestDatatime){
		TestDatatime=TestDatatime.trim();
	}
	if(null!=EMPID){
		EMPID=EMPID.trim();
	}
	if(null!=DIAG){
		DIAG=DIAG.trim();
	}
	if(null!=CurStation){
		CurStation=CurStation.trim();
	}
	if(null!=LineName){
		LineName=LineName.trim();
	}
	if(null!=Field1){
		Field1=Field1.trim();
	}
	if(null!=Field2){
		Field2=Field2.trim();
	}
	if(null!=Field3){
		Field3=Field3.trim();
	}
	Map<String,String> map = new HashMap<String,String>();
	String retmsg ="";
	map.put("plantCode",PlantCode);
	map.put("ssn", SSN);
	map.put("fixtureID", FixtureID);
	map.put("testResult", TestResult);
	map.put("errorCode", ErrorCode);
	map.put("failDetailReason", FailDetailReason);
	map.put("testDatatime", TestDatatime);
	map.put("empID", EMPID);
	map.put("diag", DIAG);
	map.put("curStation", CurStation);
	map.put("lineName", LineName);
	map.put("field1", Field1);
	map.put("field2", Field2);
	map.put("field3", Field3);
	map.put("retflag", "");
	map.put("retmsg", retmsg);
	try {
		dao.updateSSNStatus(map);
	} catch (Exception e) {
		logger.error(e.getMessage());
	}
	return map.get("retmsg");
}
private void writeLog(String strSSN,String xml){
	
	FileWriter fileWriter=null;
	String baseLocalDir = "c:\\textXmlBackUp_dothill\\";
	File file = new File(baseLocalDir);
	if(!file.exists()){
		file.mkdirs();
	}
	try {
		SimpleDateFormat sdf = new SimpleDateFormat("-yyyy-MM-dd-HH-mm-ss");
		fileWriter = new FileWriter(baseLocalDir+"\\"+strSSN+sdf.format(new Date())+".txt",true);
		fileWriter.write(xml);
		fileWriter.flush();
		fileWriter.close();
	} catch (Exception e) {
		logger.info(e.getMessage());
	}
}
@Override
public String getSSNStatusXmlDataByInput(String strPlantCode, String strSSN) {
	return getSSNStatusByInput(strPlantCode,strSSN);
}
}