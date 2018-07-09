

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
			url:"services/Service1",
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
			url:"services/Service1",
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
	
	
	