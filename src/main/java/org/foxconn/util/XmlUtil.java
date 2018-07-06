package org.foxconn.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class XmlUtil {
	public static String formateXML(String xmlMsg) {
		if(null==xmlMsg||"".equals(xmlMsg)){
			return xmlMsg;
		}
		XMLWriter writer = null;
		String paramXML = "";
		try {
		   SAXReader reader = new SAXReader();
		   Document _document = reader.read(new StringReader(xmlMsg));
		   OutputFormat format = OutputFormat.createPrettyPrint();
		   format.setEncoding("utf-8");            
		   ByteArrayOutputStream out = new ByteArrayOutputStream(); 
		   writer = new XMLWriter(out, format); 
		   writer.write(_document);
		   writer.flush();
		   writer.close();
		   paramXML = out.toString(format.getEncoding());
		} catch (Exception e){
			return xmlMsg;
		}
		return paramXML;
	}
}
