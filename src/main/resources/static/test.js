

	$(function() {
		$("#getSSNPost").click(getSSNPost);
		$("#updateSSNPost").click(updateSSNPost);
		$("#sfcIstpXMLDataDetailEditPOST").click(sfcIstpXMLDataDetailEditPOST);
		$("#sfcIstpXMLDataDetailEditDELETE").click(sfcIstpXMLDataDetailEditDELETE);
		$("#sfcIstpXMLDataDetailEditPUT").click(sfcIstpXMLDataDetailEditPUT);
		$("#sfcIstpXMLDataDetailEditGET").click(sfcIstpXMLDataDetailEditGET);
		$("#sfcIstpXMLDataDetailEditGETXML").click(sfcIstpXMLDataDetailEditGETXML);
		$("#sfcIstpXMLDataDetailEditArea").hide();
		$("#updateSSNArea").hide();
		$("#getSSNArea").hide();
	  }
	);
	
	function getSSNPost(){
		$.ajax({
			url:"services/Service1.Service1HttpSoap12Endpoint?wsdl",
			type:"POST",
			data:"<?xml version=\"1.0\" encoding=\"utf-8\"?>"+
				"<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:ns=\"http://impl.service.seagate.foxconn.org\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">"+
//				"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"+
				"  <soap:Body>"+
				"    <ns:getSSNStatusByInput xmlns=\"http://impl.service.seagate.foxconn.org\">"+
				"      <strPlantCode/>"+
				"      <strSSN>"+$("#strSSNGet").val()+"</strSSN>"+
				"    </ns:getSSNStatusByInput>"+
				"  </soap:Body>"+
				"</soap:Envelope>",
			contentType:"application/xml;charset=utf-8",
			dataType:"text",
			success:function(result){
				$("#getSSNAreaText").html(result);
				$("#getSSNArea").show();
			},
			error:function(){
				$("#updateSSNAreaText").html("error ,please check the log");
				$("#getSSNArea").show();
			}
		});
	}
	
	function updateSSNPost(){
		$.ajax({
			url:"services/Service1.Service1HttpSoap12Endpoint?wsdl",
			type:"POST",
			data:"<?xml version=\"1.0\" encoding=\"utf-8\"?>"+
				"<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">"+
//				"	<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"+
				"	  <soap:Body>"+
				"	    <updateSSNStatusByInput xmlns=\"http://impl.service.seagate.foxconn.org\">"+
				"	      <PlantCode  >"+$("#PlantCode").val()+"</PlantCode>"+
				"	      <SSN  >"+$("#SSN").val()+"</SSN>"+
				"	      <FixtureID  >"+$("#FixtureID").val()+"</FixtureID>"+
				"	      <TestResult >"+$("#TestResult").val()+"</TestResult>"+
				"	      <ErrorCode >"+$("#ErrorCode").val()+"</ErrorCode>"+
				"	      <FailDetailReason >"+$("#FailDetailReason").val()+"</FailDetailReason>"+
				"	      <TestDatatime  >"+$("#TestDatatime").val()+"</TestDatatime>"+
				"	      <EMPID  >"+$("#EMPID").val()+"</EMPID>"+
				"	      <DIAG  >"+$("#DIAG").val()+"</DIAG>"+
				"	      <CurStation  >"+$("#CurStation").val()+"</CurStation>"+
				"	      <LineName  >"+$("#LineName").val()+"</LineName>"+
				"	      <Field1  >"+$("#Field1").val()+"</Field1>"+
				"	      <Field2  >"+$("#Field2").val()+"</Field2>"+
				"	      <Field3  >"+$("#Field3").val()+"</Field3>"+
				"	    </updateSSNStatusByInput>"+
				"	  </soap:Body>"+
				"	</soap:Envelope>",
			contentType:"application/xml;charset=utf-8",
			dataType:"text",
			success:function(result){
				$("#updateSSNAreaText").html(result);
				$("#updateSSNArea").show();
			},
			error:function(error){
				$("#updateSSNAreaText").html("error ,please check the log");
				$("#updateSSNArea").show();
			}
		});
	}
	
	function sfcIstpXMLDataDetailEditPOST(){
		$.ajax({
			url:"services/Service2/sfcIstpXMLDataDetailEdit",
			type:"POST",
			data:"{" +
					"\"strTransType\":\""+$("#strTransType").val()+"\"," +
					"\"strSite\":\""+$("#strSite").val()+"\","+
					"\"strDataType\":\""+$("#strDataType").val()+"\","+
					"\"strPART_NUMBER\":\""+$("#strPART_NUMBER").val()+"\","+
					"\"strSERIAL_NUMBER\":\""+$("#strSERIAL_NUMBER").val()+"\","+
					"\"strFEATURE_CODE\":\""+$("#strFEATURE_CODE").val()+"\","+
					"\"strMATERIAL_CLASS\":\""+$("#strMATERIAL_CLASS").val()+"\","+
					"\"strCHARACTERISTIC\":\""+$("#strCHARACTERISTIC").val()+"\","+
					"\"strCOMPONENT_TYPE\":\""+$("#strCOMPONENT_TYPE").val()+"\","+
					"\"strWWN\":\""+$("#strWWN").val()+"\","+
					"\"strCUST_SERIAL\":\""+$("#strCUST_SERIAL").val()+"\","+
					"\"strPARENT_MATNR\":\""+$("#strPARENT_MATNR").val()+"\","+
					"\"strPARENT_SERNR\":\""+$("#strPARENT_SERNR").val()+"\","+
					"\"strECB_C\":\""+$("#strECB_C").val()+"\","+
					"\"strEQUIPMENT_NO\":\""+$("#strEQUIPMENT_NO").val()+"\","+
					"\"strSERVICE_TAG_C\":\""+$("#strSERVICE_TAG_C").val()+"\","+
					"\"strPOSITION_TYPE\":\""+$("#strPOSITION_TYPE").val()+"\","+
					"\"strPOSITION_NO\":\""+$("#strPOSITION_NO").val()+"\","+
					"\"strCUST_PART\":\""+$("#strCUST_PART").val()+"\","+
					"\"strCUST_ECREV\":\""+$("#strCUST_ECREV").val()+"\","+
					"\"strVENDOR_PART\":\""+$("#strVENDOR_PART").val()+"\","+
					"\"strPOSITION_REQD\":\""+$("#strPOSITION_REQD").val()+"\""+
					"}",
			contentType:"application/json;charset=utf-8",
			dataType:"text",
			success:function(result){
				$("#sfcIstpXMLDataDetailEditAreaText").html(result);
				$("#sfcIstpXMLDataDetailEditArea").show();
			},
			error:function(error){
				$("#sfcIstpXMLDataDetailEditAreaText").html("error ,please check the log");
				$("#sfcIstpXMLDataDetailEditArea").show();
			}
		});
	}
	function sfcIstpXMLDataDetailEditDELETE(){
		$.ajax({
			url:"services/Service2/sfcIstpXMLDataDetailEdit",
			type:"DELETE",
			data:"{" +
					"\"strTransType\":\""+$("#strTransType").val()+"\"," +
					"\"strSite\":\""+$("#strSite").val()+"\","+
					"\"strDataType\":\""+$("#strDataType").val()+"\","+
					"\"strPART_NUMBER\":\""+$("#strPART_NUMBER").val()+"\","+
					"\"strSERIAL_NUMBER\":\""+$("#strSERIAL_NUMBER").val()+"\","+
					"\"strFEATURE_CODE\":\""+$("#strFEATURE_CODE").val()+"\","+
					"\"strMATERIAL_CLASS\":\""+$("#strMATERIAL_CLASS").val()+"\","+
					"\"strCHARACTERISTIC\":\""+$("#strCHARACTERISTIC").val()+"\","+
					"\"strCOMPONENT_TYPE\":\""+$("#strCOMPONENT_TYPE").val()+"\","+
					"\"strWWN\":\""+$("#strWWN").val()+"\","+
					"\"strCUST_SERIAL\":\""+$("#strCUST_SERIAL").val()+"\","+
					"\"strPARENT_MATNR\":\""+$("#strPARENT_MATNR").val()+"\","+
					"\"strPARENT_SERNR\":\""+$("#strPARENT_SERNR").val()+"\","+
					"\"strECB_C\":\""+$("#strECB_C").val()+"\","+
					"\"strEQUIPMENT_NO\":\""+$("#strEQUIPMENT_NO").val()+"\","+
					"\"strSERVICE_TAG_C\":\""+$("#strSERVICE_TAG_C").val()+"\","+
					"\"strPOSITION_TYPE\":\""+$("#strPOSITION_TYPE").val()+"\","+
					"\"strPOSITION_NO\":\""+$("#strPOSITION_NO").val()+"\","+
					"\"strCUST_PART\":\""+$("#strCUST_PART").val()+"\","+
					"\"strCUST_ECREV\":\""+$("#strCUST_ECREV").val()+"\","+
					"\"strVENDOR_PART\":\""+$("#strVENDOR_PART").val()+"\","+
					"\"strPOSITION_REQD\":\""+$("#strPOSITION_REQD").val()+"\""+
					"}",
			contentType:"application/json;charset=utf-8",
			dataType:"text",
			success:function(result){
				$("#sfcIstpXMLDataDetailEditAreaText").html(result);
				$("#sfcIstpXMLDataDetailEditArea").show();
			},
			error:function(error){
				$("#sfcIstpXMLDataDetailEditAreaText").html("error ,please check the log");
				$("#sfcIstpXMLDataDetailEditArea").show();
			}
		});
	}
	
	function sfcIstpXMLDataDetailEditPUT(){
		$.ajax({
			url:"services/Service2/sfcIstpXMLDataDetailEdit",
			type:"PUT",
			data:"{" +
					"\"strTransType\":\""+$("#strTransType").val()+"\"," +
					"\"strSite\":\""+$("#strSite").val()+"\","+
					"\"strDataType\":\""+$("#strDataType").val()+"\","+
					"\"strPART_NUMBER\":\""+$("#strPART_NUMBER").val()+"\","+
					"\"strSERIAL_NUMBER\":\""+$("#strSERIAL_NUMBER").val()+"\","+
					"\"strFEATURE_CODE\":\""+$("#strFEATURE_CODE").val()+"\","+
					"\"strMATERIAL_CLASS\":\""+$("#strMATERIAL_CLASS").val()+"\","+
					"\"strCHARACTERISTIC\":\""+$("#strCHARACTERISTIC").val()+"\","+
					"\"strCOMPONENT_TYPE\":\""+$("#strCOMPONENT_TYPE").val()+"\","+
					"\"strWWN\":\""+$("#strWWN").val()+"\","+
					"\"strCUST_SERIAL\":\""+$("#strCUST_SERIAL").val()+"\","+
					"\"strPARENT_MATNR\":\""+$("#strPARENT_MATNR").val()+"\","+
					"\"strPARENT_SERNR\":\""+$("#strPARENT_SERNR").val()+"\","+
					"\"strECB_C\":\""+$("#strECB_C").val()+"\","+
					"\"strEQUIPMENT_NO\":\""+$("#strEQUIPMENT_NO").val()+"\","+
					"\"strSERVICE_TAG_C\":\""+$("#strSERVICE_TAG_C").val()+"\","+
					"\"strPOSITION_TYPE\":\""+$("#strPOSITION_TYPE").val()+"\","+
					"\"strPOSITION_NO\":\""+$("#strPOSITION_NO").val()+"\","+
					"\"strCUST_PART\":\""+$("#strCUST_PART").val()+"\","+
					"\"strCUST_ECREV\":\""+$("#strCUST_ECREV").val()+"\","+
					"\"strVENDOR_PART\":\""+$("#strVENDOR_PART").val()+"\","+
					"\"strPOSITION_REQD\":\""+$("#strPOSITION_REQD").val()+"\""+
					"}",
			contentType:"application/json;charset=utf-8",
			dataType:"text",
			success:function(result){
				$("#sfcIstpXMLDataDetailEditAreaText").html(result);
				$("#sfcIstpXMLDataDetailEditArea").show();
			},
			error:function(error){
				$("#sfcIstpXMLDataDetailEditAreaText").html("error ,please check the log");
				$("#sfcIstpXMLDataDetailEditArea").show();
			}
		});
	}
	
	function sfcIstpXMLDataDetailEditGET(){
		$.ajax({
			url:"services/Service2/sfcIstpXMLDataDetailEdit/"+$("#strSERIAL_NUMBER").val(),
			type:"GET",
			data:"",
			contentType:"application/json;charset=utf-8",
			dataType:"text",
			success:function(result){
				$("#sfcIstpXMLDataDetailEditAreaText").html(result);
				$("#sfcIstpXMLDataDetailEditArea").show();
			},
			error:function(error){
				$("#sfcIstpXMLDataDetailEditAreaText").html("error ,please check the log");
				$("#sfcIstpXMLDataDetailEditArea").show();
			}
		});
	}
	function sfcIstpXMLDataDetailEditGETXML(){
		$.ajax({
			url:"services/Service1.Service1HttpSoap12Endpoint?wsdl",
			type:"POST",
			data:"<?xml version=\"1.0\" encoding=\"utf-8\"?>"+
				"<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">"+
//				"	<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"+
				"	  <soap:Body>"+
				"	    <sfcIstpXMLDataDetailEdit xmlns=\"http://impl.service.seagate.foxconn.org\">"+
				"	      <strTransType />"+
				"	      <strSite />"+
				"	      <strDataType />"+
				"	      <strPART_NUMBER />"+
				"	      <strSERIAL_NUMBER>"+$("#strSERIAL_NUMBER").val()+" </strSERIAL_NUMBER>"+
				"	      <strFEATURE_CODE />"+
				"	      <strMATERIAL_CLASS />"+
				"	      <strCHARACTERISTIC />"+
				"	      <strCOMPONENT_TYPE />"+
				"	      <strWWN />"+
				"	      <strCUST_SERIAL />"+
				"	      <strPARENT_MATNR />"+
				"	      <strPARENT_SERNR />"+
				"	      <strECB_C />"+
				"	      <strEQUIPMENT_NO />"+
				"	      <strMAC_ADDR_C />"+
				"	      <strSERVICE_TAG_C />"+
				"	      <strPOSITION_TYPE />"+
				"	      <strPOSITION_NO />"+
				"	      <strCUST_PART />"+
				"	      <strCUST_ECREV />"+
				"	      <strVENDOR_PART />"+
				"	      <strPOSITION_REQD />"+
				"	      <xmlDetailNode />"+
				"	      <retflag />"+
				"	      <retmsg />"+
				"	    </sfcIstpXMLDataDetailEdit>"+
				"	  </soap:Body>"+
				"	</soap:Envelope>",
			contentType:"application/json;charset=utf-8",
			dataType:"text",
			success:function(result){
				$("#sfcIstpXMLDataDetailEditAreaText").html(result);
				$("#sfcIstpXMLDataDetailEditArea").show();
			},
			error:function(error){
				$("#sfcIstpXMLDataDetailEditAreaText").html("error ,please check the log");
				$("#sfcIstpXMLDataDetailEditArea").show();
			}
		});
	}
	
	
	
	
//	function GetJsonData() {
//	    var json = {strPART_NUMBER:"123",strSERIAL_NUMBER:"abc"};
//	    return json;
//	}
//	
	
	  function doSearch2(){
		  window.location.href="services/Service2/getSSNStatusByInput/"+$('#input_SearchSysserialnos').val();
	  }
	