package com.incture.accpay.ecm;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.chemistry.opencmis.client.api.Session;
import org.apache.chemistry.opencmis.commons.exceptions.CmisObjectNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sap.ecm.api.EcmService;
import com.sap.ecm.api.RepositoryOptions;
import com.sap.ecm.api.RepositoryOptions.Visibility;

public class ECMSingleton {
	private static ECMSingleton INSTANCE = null;
	private static final Logger LOGGER = LoggerFactory.getLogger(ECMSingleton.class);

    private Session openCmisSession = null;

	private ECMSingleton() {
		 EcmService ecmService = null;
	        String ecmServiceLookupName = "java:comp/env/" + "EcmService";
	        try {
	            InitialContext ctx = new InitialContext();
	            ecmService = (EcmService) ctx.lookup(ecmServiceLookupName);
	            LOGGER.debug("Retrieved service instance for " + ecmServiceLookupName );
	        } catch (NamingException e) {
	            throw new RuntimeException("Lookup of ECM service " + ecmServiceLookupName
	                    + " via JNDI failed with reason: " + e.getMessage());
	        }

	        String uniqueName = "AccPayRepository";
	        String secretKey = "AccPayRepository";
	        try {
	            // Connect to ECM service accessing the repository
	            openCmisSession = ecmService.connect(uniqueName, secretKey);

	        } catch (CmisObjectNotFoundException e) {
	            RepositoryOptions options = new RepositoryOptions();
	            options.setUniqueName(uniqueName);
	            options.setRepositoryKey(secretKey);
	            options.setVisibility(Visibility.PROTECTED);
	            options.setMultiTenantCapable(true);
	            ecmService.createRepository(options);
	            openCmisSession = ecmService.connect(uniqueName, secretKey);
	        } catch (Exception e) {
	            throw new RuntimeException("Connect to ECM service failed with reason: " + e.getMessage(), e);
	        }
	}

	public static ECMSingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (ECMSingleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new ECMSingleton();
				}
			}
		}
		return INSTANCE;
	}
	
	public static Session getConnection(){
		return getInstance().openCmisSession;
	}
}