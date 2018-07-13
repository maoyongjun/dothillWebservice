package org.foxconn.util;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.log4j.Logger;
import org.foxconn.entity.SOAPModel;
import org.foxconn.seagate.service.CommonService;

//在字符串长度超长时，测试存在问题，后来改用了在Rest服务中注册  实现类的服务类
public class ClientUtil {
	

	public  String getResult(String strSSN){
		String result_pre=
		"<ns:getSSNStatusByInputResponse xmlns:ns=\"http://impl.service.seagate.foxconn.org\"><ns:return>";
		String result_suf=
		"</ns:return></ns:getSSNStatusByInputResponse>";
		
		String result ="";
		try {
			 JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();  
	         factory.setServiceClass(CommonService.class);  
	         factory.setAddress("http://localhost:8082/services"+SOAPModel.address);  
	         CommonService service = (CommonService)factory.create();  
	         result = service.getSSNStatusByInput("",strSSN); 
		} catch (Exception e) {
			Logger logger = Logger.getLogger(ClientUtil.class);
			String errorMsg = e.getCause().toString();
			logger.error(errorMsg);
			int length=errorMsg.length();
			result= length>200?errorMsg.substring(0, 200):errorMsg;
		}
        return result_pre+result+result_suf ;
	}
	
	public  String updateSSNStatusByInput(String PlantCode, String SSN, String FixtureID, String TestResult, String ErrorCode,
			String FailDetailReason, String TestDatatime, String EMPID, String DIAG, String CurStation, String LineName, 
			String Field1, String Field2, String Field3) {
			String result_pre=
			"<ns:updateSSNStatusByInputResponse xmlns:ns=\"http://impl.service.seagate.foxconn.org\"><ns:return>";
			String result_suf=
			"</ns:return></ns:updateSSNStatusByInputResponse>";
			
			String result ="";
			try {
				 JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();  
		         factory.setServiceClass(CommonService.class);  
		         factory.setAddress("http://localhost:8082/services"+SOAPModel.address);  
		         CommonService service = (CommonService)factory.create();  
		         result = service.updateSSNStatusByInput(PlantCode, SSN, FixtureID, TestResult, ErrorCode, FailDetailReason, TestDatatime, EMPID, DIAG, CurStation, LineName, Field1, Field2, Field3); 
			} catch (Exception e) {
				Logger logger = Logger.getLogger(ClientUtil.class);
				String errorMsg = e.getCause().toString();
				logger.error(errorMsg);
				int length=errorMsg.length();
				result= length>200?errorMsg.substring(0, 200):errorMsg;
			}
	        return result_pre+result+result_suf ;
		
	}
	
//	public static void main(String[] args) {
//	try {
//		ClientUtil util = new ClientUtil();
//		util.getResult("1234");
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//}
}
