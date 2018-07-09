package org.foxconn.seagate.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

import org.foxconn.entity.SOAPModel;


/**
* @author:myz
* @version 1.0 
* 创建时间：2018年5月12日 下午7:06:05
*/
@WebService(name = "Service1", // 暴露服务名称
targetNamespace = SOAPModel.namespace// 命名空间,一般是接口的包名倒序,
)
public interface CommonService {
@WebMethod(action=SOAPModel.namespace+"/getSSNStatusByInput")
@WebResult(name = "String", targetNamespace = "")
public String getSSNStatusByInput(@WebParam(name="strPlantCode",targetNamespace=SOAPModel.namespace)String strPlantCode,@WebParam(name = "strSSN",targetNamespace=SOAPModel.namespace) String strSSN);

@WebMethod(action=SOAPModel.namespace+"/updateSSNStatusByInput")
@WebResult(name = "String", targetNamespace ="")
public String updateSSNStatusByInput(
		@WebParam(name  = "PlantCode",targetNamespace=SOAPModel.namespace)String PlantCode,
		@WebParam(name  = "SSN",targetNamespace=SOAPModel.namespace)String SSN, 
		@WebParam(name  = "FixtureID",targetNamespace=SOAPModel.namespace)String FixtureID,
		@WebParam(name  = "TestResult",targetNamespace=SOAPModel.namespace)String TestResult,
		@WebParam(name  = "ErrorCode",targetNamespace=SOAPModel.namespace)String ErrorCode,
		@WebParam(name  = "FailDetailReason",targetNamespace=SOAPModel.namespace)String FailDetailReason,
		@WebParam(name  = "TestDatatime",targetNamespace=SOAPModel.namespace)String TestDatatime,
		@WebParam(name  = "EMPID",targetNamespace=SOAPModel.namespace)String EMPID,
		@WebParam(name  = "DIAG",targetNamespace=SOAPModel.namespace)String DIAG, 
		@WebParam(name  = "CurStation",targetNamespace=SOAPModel.namespace)String CurStation,
		@WebParam(name  = "LineName",targetNamespace=SOAPModel.namespace)String LineName,
		@WebParam(name  = "Field1",targetNamespace=SOAPModel.namespace)String Field1,
		@WebParam(name  = "Field2",targetNamespace=SOAPModel.namespace)String Field2,
		@WebParam(name  = "Field3",targetNamespace=SOAPModel.namespace)String Field3) ;

}
