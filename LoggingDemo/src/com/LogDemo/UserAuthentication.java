package com.LogDemo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UserAuthentication {
	Log logger=LogFactory.getLog(UserAuthentication.class);
	
	public String loginUser(String username, String password) {
		if (username.isBlank()) {
			logger.info("Username is blank");
			throw new RuntimeException("user invalid");
		}
		logger.info("Succesfully logged in");
		return "Successfully logged in";
	}

}
