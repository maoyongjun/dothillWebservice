package org.foxonn.interceptor;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.cxf.attachment.DelegatingInputStream;
import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

public class MyJAXOutputInterceptor extends AbstractPhaseInterceptor<Message> {

	public MyJAXOutputInterceptor(String phase) {
		super(phase);
	}

	@Override
	public void handleMessage(Message message) throws Fault {
		 handle( message) ;
	}


	private void handle(Message message) throws Fault {
		try {
			OutputStream os = message.getContent(OutputStream.class);
			ByteArrayOutputStream byteArrayOutput = new ByteArrayOutputStream();
			message.setContent(OutputStream.class, byteArrayOutput);
			message.getInterceptorChain().doIntercept(message);//通过拦截器将byteArrayOutput字节流注入进去
			ByteArrayOutputStream newByteArrayOutput =  (ByteArrayOutputStream) message.getContent(OutputStream.class);
			String xml = new String(newByteArrayOutput.toByteArray(),"UTF-8");//输出流转化为String
			xml = "<?xml version='1.0' encoding='UTF-8'?>" + xml;
			xml = xml.replaceAll("soap:", "soapenv:").replaceAll(":soap", ":soapenv").replaceAll("ns2:", "ns:")
					.replaceAll(":ns2", ":ns").replaceAll("return>", "ns:return>").replaceAll("<return", "<ns:return").replaceAll("&#xd;", "")
					.replaceFirst("<soapenv:Body>", "<soapenv:Header/><soapenv:Body>").replace("<String>", "<ns:return>").replace("</String>", "</ns:return>");
			ByteArrayInputStream byteArrayInput = new ByteArrayInputStream(xml.getBytes("UTF-8"));//String转化为输入流
			IOUtils.copy(byteArrayInput, os)	;//写回到输出流中
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
