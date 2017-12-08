package com.incture.accpay.util;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class AppProps {

	public AppPropsRespDto readAppProperties() {

		AppPropsRespDto appProperties = new AppPropsRespDto();

		try {
			InitialContext ctx = new InitialContext();
			String JNDI_NAME_APPLICATION_CONFIGURATION = "ApplicationConfiguration";
			/*ApplicationPropertiesAccess appCfgProps = (ApplicationPropertiesAccess) ctx
					.lookup(JNDI_NAME_APPLICATION_CONFIGURATION);
			java.util.Properties appProps = appCfgProps
					.getApplicationProperties();

			appProperties.setDespThreshold(Double.parseDouble("70.0"));*/

			return appProperties;
		} catch (NamingException e) {

			throw new RuntimeException();

		}
	}
}
