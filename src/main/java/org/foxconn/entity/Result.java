package org.foxconn.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
* @author:myz
* @version 1.0 
* ����ʱ�䣺2018��5��25�� ����9:16:20
*/
@XmlRootElement
public class Result implements Serializable{
	private	String	strPlantCode	;
	private	String	strSSN	;
	private	String	strFixtureID	;
	private	String	strTestResult	;
	private	String	strErrorCode	;
	private	String	strFailDetailReason	;
	private	String	strTestDatatime	;
	private	String	strEMPID	;
	private	String	strDIAG	;
	private	String	strCurStation	;
	private	String	strLineName	;
	private	String	strField1	;
	private	String	strField2	;
	private	String	strField3	;
	private	String	strActionCode	;
	private	String	strActionDesc	;
	private	String	strReplacePN	;
	private	String	strFailCSN	;
	private	String	strNewCSN	;
	private	String	strField4	;
	private	String	strField5	;
	private	String	strField6	;
	private	String	strField7	;
	private	String	strField8	;
	private	String	strField9	;
	private	String	strAtoTestLogname	;
	private	String	strAtoTestParam	;
	private	String	strATOTestApplicationVersion	;
	private	String	strClientIp  	;
	private	String	strWebUrl 	;
	public String getStrPlantCode() {
		return strPlantCode;
	}
	public void setStrPlantCode(String strPlantCode) {
		this.strPlantCode = strPlantCode;
	}
	public String getStrSSN() {
		return strSSN;
	}
	public void setStrSSN(String strSSN) {
		this.strSSN = strSSN;
	}
	public String getStrFixtureID() {
		return strFixtureID;
	}
	public void setStrFixtureID(String strFixtureID) {
		this.strFixtureID = strFixtureID;
	}
	public String getStrTestResult() {
		return strTestResult;
	}
	public void setStrTestResult(String strTestResult) {
		this.strTestResult = strTestResult;
	}
	public String getStrErrorCode() {
		return strErrorCode;
	}
	public void setStrErrorCode(String strErrorCode) {
		this.strErrorCode = strErrorCode;
	}
	public String getStrFailDetailReason() {
		return strFailDetailReason;
	}
	public void setStrFailDetailReason(String strFailDetailReason) {
		this.strFailDetailReason = strFailDetailReason;
	}
	public String getStrTestDatatime() {
		return strTestDatatime;
	}
	public void setStrTestDatatime(String strTestDatatime) {
		this.strTestDatatime = strTestDatatime;
	}
	public String getStrEMPID() {
		return strEMPID;
	}
	public void setStrEMPID(String strEMPID) {
		this.strEMPID = strEMPID;
	}
	public String getStrDIAG() {
		return strDIAG;
	}
	public void setStrDIAG(String strDIAG) {
		this.strDIAG = strDIAG;
	}
	public String getStrCurStation() {
		return strCurStation;
	}
	public void setStrCurStation(String strCurStation) {
		this.strCurStation = strCurStation;
	}
	public String getStrLineName() {
		return strLineName;
	}
	public void setStrLineName(String strLineName) {
		this.strLineName = strLineName;
	}
	public String getStrField1() {
		return strField1;
	}
	public void setStrField1(String strField1) {
		this.strField1 = strField1;
	}
	public String getStrField2() {
		return strField2;
	}
	public void setStrField2(String strField2) {
		this.strField2 = strField2;
	}
	public String getStrField3() {
		return strField3;
	}
	public void setStrField3(String strField3) {
		this.strField3 = strField3;
	}
	public String getStrActionCode() {
		return strActionCode;
	}
	public void setStrActionCode(String strActionCode) {
		this.strActionCode = strActionCode;
	}
	public String getStrActionDesc() {
		return strActionDesc;
	}
	public void setStrActionDesc(String strActionDesc) {
		this.strActionDesc = strActionDesc;
	}
	public String getStrReplacePN() {
		return strReplacePN;
	}
	public void setStrReplacePN(String strReplacePN) {
		this.strReplacePN = strReplacePN;
	}
	public String getStrFailCSN() {
		return strFailCSN;
	}
	public void setStrFailCSN(String strFailCSN) {
		this.strFailCSN = strFailCSN;
	}
	public String getStrNewCSN() {
		return strNewCSN;
	}
	public void setStrNewCSN(String strNewCSN) {
		this.strNewCSN = strNewCSN;
	}
	public String getStrField4() {
		return strField4;
	}
	public void setStrField4(String strField4) {
		this.strField4 = strField4;
	}
	public String getStrField5() {
		return strField5;
	}
	public void setStrField5(String strField5) {
		this.strField5 = strField5;
	}
	public String getStrField6() {
		return strField6;
	}
	public void setStrField6(String strField6) {
		this.strField6 = strField6;
	}
	public String getStrField7() {
		return strField7;
	}
	public void setStrField7(String strField7) {
		this.strField7 = strField7;
	}
	public String getStrField8() {
		return strField8;
	}
	public void setStrField8(String strField8) {
		this.strField8 = strField8;
	}
	public String getStrField9() {
		return strField9;
	}
	public void setStrField9(String strField9) {
		this.strField9 = strField9;
	}
	public String getStrAtoTestLogname() {
		return strAtoTestLogname;
	}
	public void setStrAtoTestLogname(String strAtoTestLogname) {
		this.strAtoTestLogname = strAtoTestLogname;
	}
	public String getStrAtoTestParam() {
		return strAtoTestParam;
	}
	public void setStrAtoTestParam(String strAtoTestParam) {
		this.strAtoTestParam = strAtoTestParam;
	}
	public String getStrATOTestApplicationVersion() {
		return strATOTestApplicationVersion;
	}
	public void setStrATOTestApplicationVersion(String strATOTestApplicationVersion) {
		this.strATOTestApplicationVersion = strATOTestApplicationVersion;
	}
	public String getStrClientIp() {
		return strClientIp;
	}
	public void setStrClientIp(String strClientIp) {
		this.strClientIp = strClientIp;
	}
	public String getStrWebUrl() {
		return strWebUrl;
	}
	public void setStrWebUrl(String strWebUrl) {
		this.strWebUrl = strWebUrl;
	}
	@Override
	public String toString() {
		return "Result [strPlantCode=" + strPlantCode + ", strSSN=" + strSSN + ", strFixtureID=" + strFixtureID
				+ ", strTestResult=" + strTestResult + ", strErrorCode=" + strErrorCode + ", strFailDetailReason="
				+ strFailDetailReason + ", strTestDatatime=" + strTestDatatime + ", strEMPID=" + strEMPID + ", strDIAG="
				+ strDIAG + ", strCurStation=" + strCurStation + ", strLineName=" + strLineName + ", strField1="
				+ strField1 + ", strField2=" + strField2 + ", strField3=" + strField3 + ", strActionCode="
				+ strActionCode + ", strActionDesc=" + strActionDesc + ", strReplacePN=" + strReplacePN
				+ ", strFailCSN=" + strFailCSN + ", strNewCSN=" + strNewCSN + ", strField4=" + strField4
				+ ", strField5=" + strField5 + ", strField6=" + strField6 + ", strField7=" + strField7 + ", strField8="
				+ strField8 + ", strField9=" + strField9 + ", strAtoTestLogname=" + strAtoTestLogname
				+ ", strAtoTestParam=" + strAtoTestParam + ", strATOTestApplicationVersion="
				+ strATOTestApplicationVersion + ", strClientIp=" + strClientIp + ", strWebUrl=" + strWebUrl + "]";
	}
	
	
}
