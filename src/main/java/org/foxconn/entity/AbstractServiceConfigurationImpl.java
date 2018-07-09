package org.foxconn.entity;

import java.lang.reflect.Method;

import org.apache.cxf.common.util.StringUtils;
import org.apache.cxf.service.model.OperationInfo;
import org.apache.cxf.wsdl.service.factory.AbstractServiceConfiguration;

public class AbstractServiceConfigurationImpl extends AbstractServiceConfiguration{

	@Override
	public String getAction(OperationInfo op, Method method) {
		String action = op.getName().getLocalPart();
        if (StringUtils.isEmpty(action)) {
            action = method.getName();
        }
        return action;
	}
	
}
