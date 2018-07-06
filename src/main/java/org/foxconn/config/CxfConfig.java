package org.foxconn.config;


import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.phase.Phase;
import org.foxconn.entity.SOAPModel;
import org.foxconn.seagate.service.CommonService;
import org.foxonn.interceptor.MyJAXOutputInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author:myz
 * @version 1.0 创建时间：2018年5月12日 下午7:07:59
 */
@Configuration
public class CxfConfig {
	@Autowired
	private Bus bus;
	
	@Autowired
	CommonService commonService;

	/** JAX-WS **/
	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, commonService);
		endpoint.publish(SOAPModel.address);
		MyJAXOutputInterceptor jAXRSOutInterceptor = new MyJAXOutputInterceptor(Phase.PRE_STREAM);
		endpoint.getOutInterceptors().add(jAXRSOutInterceptor);
		LoggingInInterceptor loggingInInterceptor = new LoggingInInterceptor();
		LoggingOutInterceptor loggingOutInterceptor = new LoggingOutInterceptor();;
		endpoint.getOutInterceptors().add(loggingOutInterceptor);
		endpoint.getInInterceptors().add(loggingInInterceptor);
		return endpoint;
	}

	
}
