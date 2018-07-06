package org.foxconn.seagate.service.impl;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.foxconn.dao.WebServiceDao;
import org.foxconn.seagate.service.CommonService;
import org.foxconn.util.ClientUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/webservice/services/Service1.Service1HttpSoap12Endpoint")
public class RestService{
	Logger logger = Logger.getLogger(RestService.class);
	@Resource
	private CommonService service;
	@Resource
	HttpServletRequest request;
	
	@RequestMapping(value="/getSSNStatusByInput", method=RequestMethod.POST,produces = "application/xml; charset=UTF-8") 
	public String getSSN(String strPlantCode,String strSSN) {
		logger.info(request.getRemoteAddr()+":"+"strPlantCode:"+strPlantCode+",strSSN:"+strSSN);
		String result_pre="<ns:getSSNStatusByInputResponse xmlns:ns=\"http://impl.service.seagate.foxconn.org\"><ns:return>";
		String result_suf="</ns:return></ns:getSSNStatusByInputResponse>";	
		String result =service.getSSNStatusByInput(strPlantCode, strSSN);
		return result_pre+result+result_suf;
		
	}

	@RequestMapping(value="/updateSSNStatusByInput", method=RequestMethod.POST,produces = "application/xml; charset=UTF-8") 
	public String updateSSNStatusByInput(
			String PlantCode,
			String SSN, 
			String FixtureID,
			String TestResult,
			String ErrorCode,
			String FailDetailReason,
			String TestDatatime,
			String EMPID,
			String DIAG, 
			String CurStation,
			String LineName,
			String Field1,
			String Field2,
			String Field3) {
		logger.info(request.getRemoteAddr()+":"+"PlantCode:"+PlantCode+",SSN:"+SSN);
		String result_pre="<ns:updateSSNStatusByInputResponse xmlns:ns=\"http://impl.service.seagate.foxconn.org\"><ns:return>";
		String result_suf="</ns:return></ns:updateSSNStatusByInputResponse>";	
		String result =service.updateSSNStatusByInput(PlantCode, SSN, FixtureID, TestResult, ErrorCode, FailDetailReason, TestDatatime, EMPID, DIAG, CurStation, LineName, Field1, Field2, Field3);
		return result_pre+result+result_suf;
	}
}
